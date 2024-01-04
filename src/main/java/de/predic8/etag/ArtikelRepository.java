package de.predic8.etag;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ArtikelRepository extends JpaRepository<Artikel,Long> {
}
