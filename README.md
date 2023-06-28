# Eureka Client Application

It is a sample microservice application registered to Eureka Server.

## If you want to run it with Docker

### Before:

Cmd run "mvn package" or Eclipse/Intelij Tools select project  > choose "mvn install"

### Build: 
docker build -t sehmusaydogdu/eurekaclientapp .

### Run:   
docker run -p 8080:8080 sehmusaydogdu/eurekaclientapp

### Stop:  
docker stop <containerId>

## If you want to run it with Maven
mvn spring-boot:run