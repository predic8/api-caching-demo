package de.predic8.etag;

import de.predic8.*;
import jakarta.persistence.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static de.predic8.Utils.stripQuotes;
import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/artikel")
public class ArtikelAPI {
    
    ArtikelRepository repo;

    public ArtikelAPI(ArtikelRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public ResponseEntity<List<Artikel>> all() {
        return  ok(repo.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Artikel> get(@PathVariable("id") Long id) {
        Artikel artikel = repo.findById(id).orElseThrow();
        System.out.println("artikel = " + artikel);
        return  ok().eTag(artikel.etag()).body(artikel);
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Artikel artikel) {
        repo.save(artikel);
        
        return ok().eTag(artikel.etag()).body("Done!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id,
                                         @RequestHeader(value = "If-Match",required = false) String ifMatch,
                                         @RequestBody Artikel artikel) {

        Artikel a = repo.findById(id).orElseThrow();

        if (ifMatch != null && !a.match(stripQuotes(ifMatch)))
            return status(412).build();

        a.setPreis(artikel.getPreis());
        a.setName(artikel.getName());
        a = repo.save(a);

        return ok().eTag(a.etag()).body("Done!");
    }
}
