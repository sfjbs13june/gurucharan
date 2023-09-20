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
