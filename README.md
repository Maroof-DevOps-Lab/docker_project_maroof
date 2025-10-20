# Docker Project Maroof

A simple Java Spring Boot application containerized with Docker.

## Run Locally
```bash
mvn clean package -DskipTests
docker build -t maro/docker_project_maroof:1.0 .
docker run -d -p 8080:8080 maro/docker_project_maroof:1.0
```

Then visit: http://localhost:8080/hello
