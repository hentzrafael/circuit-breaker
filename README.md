# Circuit Breaker Architecture in Microservices
Circuit Breaker architecture is a simple way to garantee your application response when something is not working properly. A simple explanation would be:
> Monitor your application periodically and check if the requests are being processed with success, if not, register as a failure and after a certain number of failures, "break" the circuit to access another endpoint to mantain your application up and running.

## Technologies used
* Java SE Version 22
* Spring Boot
* Resilience4J

## What was developed?
I created two simple microservices:
1. One to provide interest rates based on the type of loan.
2. Another service to return the values of loan with the corresponding interest values added to it.

If you have any suggestion, feel free to add an issue to this project.

I would like to thank Salitha Chathuranga for the awesome Medium article with explanation about this architecture.

Thanks :)
