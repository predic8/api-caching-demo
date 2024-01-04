docker rm -f varnish
docker run \
  --name varnish \
	-v `pwd`/conf/varnish.vcl:/etc/varnish/default.vcl:ro \
	-p 80:80 varnish:7.4.2