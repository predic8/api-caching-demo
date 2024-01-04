docker rm -f nginx-cache
docker run --name nginx-cache -p 80:80 -v `pwd`/conf/nginx.conf:/etc/nginx/nginx.conf nginx