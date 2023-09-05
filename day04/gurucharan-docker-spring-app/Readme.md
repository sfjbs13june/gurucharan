## My first Simple Docker Spring app

### Build application

    mvn clean install

### Run Application
    mvn spring-boot:run

### Create docker image

    mvn install dockerfile:build

## Run docker image

    docker run -p 8080:8080 gurucharan06/gurucharan-docker-spring-app:1.0.0