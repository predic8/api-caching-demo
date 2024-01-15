
# Proxy Cache Demo 

Projekt zum Video:

<iframe width="560" height="315" src="https://www.youtube.com/embed/7BgkR98-anA?si=q19C3_Op1euyXZnD" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

1. Starte proxy server:

```bash
./run-squid.sh
```

oder:

```bash
./run-nginx.sh
```

oder:

```bash
./run-varnish.sh
```

2. Führe die App-Klasse aus, um die Spring Boot Anwendung zu starten.

3. Führe die Anfragen aus dem Video aus.

# Client Cache Demo ETag

Führe die Anfragen in `requests/etag-cache.http` aus.
