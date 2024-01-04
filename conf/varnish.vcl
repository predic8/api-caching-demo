vcl 4.1;

backend default {
    .host = "host.docker.internal";
    .port = "8080";
}

sub vcl_deliver {
    if (obj.hits > 0) {
        set resp.http.X-Cache = "HIT";
    } else {
        set resp.http.X-Cache = "MISS";
    }
    unset resp.http.X-Varnish;
    unset resp.http.Via;
    unset resp.http.Accept-Ranges;
}