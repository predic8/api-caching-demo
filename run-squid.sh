docker rm -f squid
docker run --name squid -e TZ=UTC -p 80:80 -v `pwd`/conf/squid.conf:/etc/squid/squid.conf ubuntu/squid:5.6-22.10_edge