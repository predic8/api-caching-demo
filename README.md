
# Proxy Cache Demo 

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

3. Führe die Anfragen in `requests/max-age.http` aus.

# Client Cache Demo ETag

Führe die Anfragen in `requests/etag-cache.http` aus.
