## Build the app

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run

```
## Creating docker image

```
mvn install dockerfile:build

```
## running docker compose

``` 
docker-compose up -d

```


## Post

``` 
hospital

curl --request POST 'http://localhost:8083/hospital/create' --header 'Content-Type: application/json' --data-raw '{"name": "Aishwarya","hospitalId": "98087Qe1","address": "Bangalore"}'
```

```
patient

curl --request POST 'http://localhost:8083/patient/create' --header 'Content-Type: application/json' --data-raw '{"name": "Mahesh","hospitalId": "90087","address": "Bangalore","disease":"Cold"}'
```
 

## Get

``` 
hospital

curl -X GET http://localhost:8083/hospital/read 
```

``` 
patient

curl -X GET http://localhost:8083/patient/read 
```


## Put

``` 
hospital

curl -X PUT 'http://localhost:8083/hospital/update?id=1re07QW1&name=Aishwarya' 
```
``` 
patient

curl -X PUT 'http://localhost:8083/patient/update?id=90034&name=Mahesh' 
```


## Delete

```
hospital

curl -X DELETE 'http://localhost:8083/hospital/delete?name=Aishwarya' 
```


```
patient
curl -X DELETE 'http://localhost:8083/patient/delete?name=Mahesh' 
```




## Show data

```
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.hospital.find()

```

```
for patient 
----
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.patient.find()


```


## Stop docker container
    docker-compose -f docker-compose-mongo.yml down

## Dockerization

### Maven
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```





#curl commands

#patient:-

post:
curl --location --request POST 'http://localhost:8080/savePatient' \
--header 'Content-Type: application/json' \
--data-raw '{
"patientname": "Guru",
"patientid": 123,
"hospitalname": "Appolo",
"disease": "cold"
}'

Get:
curl --location --request GET 'http://localhost:8080/getpatient?patientname=Guru'

Put:
curl --location --request PUT 'http://localhost:8080/updatepatient?patientname=hari&hospitalname=Manipal' \
--data-raw ''

Delete:
curl --location --request DELETE 'http://localhost:8080/removepatient?patientname=Guru'


#hospital:-

Post:
curl --location --request POST 'http://localhost:8080/savehospital' \
--header 'Content-Type: application/json' \
--data-raw '{
"hospitalname": "Aishwarya",
"hospitalid": "98760",
"address": "Bangalore"
}'

Get:
curl --location --request GET 'http://localhost:8080/gethospital?hospitalname=Aishwarya'

Put:
curl --location --request PUT 'http://localhost:8080/updatehospital?hospitalname=kkr&address=Mysore' \
--data-raw ''

Delete:
curl --location --request DELETE 'http://localhost:8080/removehospital?hospitalname=Aishwarya'
