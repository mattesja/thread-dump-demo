# Threaddump demo

- Call slow request multiple times: `ab -c 100 -n 10000 http://localhost:8880/slow`
- Or without ab: `for i in {1..20}; do curl http://localhost:8880/slow &; done`
- Get threaddump `curl -H "Accept: text/plain" -X GET http://localhost:8881/actuator/threaddump > td`
- Analyze threaddump using https://spotify.github.io/threaddump-analyzer/
