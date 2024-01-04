package de.predic8.maxage;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import static de.predic8.maxage.Faktorisierung.*;
import static org.springframework.http.ResponseEntity.*;

@RestController
public class FaktorenAPI {

    @GetMapping("/faktoren/{n}")
    public ResponseEntity<Ergebnis> faktoren(@PathVariable("n") long n) {
        return ok()
//                .header("Cache-Control","max-age=20")
                .body(zerlege(n));
    }
}
