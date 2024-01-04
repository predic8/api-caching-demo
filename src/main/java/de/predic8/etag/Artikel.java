package de.predic8.etag;

import jakarta.persistence.*;

@Entity
public class Artikel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private float preis;

    @Version
    @Column(nullable = false)
    private Long version = 1L;

    public String etag() {
        return "artikel-id%d-v%d".formatted(id,version);
    }

    public boolean match(String etag) {
        return etag.equals(etag());
    }

    public Long getVersion() {
        return version;
    }

    protected void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Artikel{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", preis=" + preis +
               ", version=" + version +
               '}';
    }
}
