# quarkus-metrics-reproducer

This project contains a very simple api with a single endpoint to reproduce a bug with the metric extension.

The api can be launched with `./gradlew quarkusDev`
You can call the endpoint by navigating to http://localhost:8080/hello/John

Then navigate to http://localhost:8080/q/metrics

What you get amongst other lines :
```text
# HELP http_server_requests_seconds  
# TYPE http_server_requests_seconds summary
http_server_requests_seconds_count{method="GET",outcome="SUCCESS",status="200",uri="/{firstname}/{firstname}",} 1.0
http_server_requests_seconds_sum{method="GET",outcome="SUCCESS",status="200",uri="/{firstname}/{firstname}",} 0.1192732
```

What you should get :
```# HELP http_server_requests_seconds  
# TYPE http_server_requests_seconds summary
http_server_requests_seconds_count{method="GET",outcome="SUCCESS",status="200",uri="/hello/{firstname}",} 1.0
http_server_requests_seconds_sum{method="GET",outcome="SUCCESS",status="200",uri="/hello/{firstname}",} 0.1192732
```