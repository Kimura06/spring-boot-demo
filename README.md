# Spring Boot Demo Application (No Database)

This project is a simple Spring Boot REST API application created for educational purposes.
The application does not use a database and demonstrates basic backend concepts.

## Description

The project is built using Spring Boot and provides several REST endpoints.
It follows a simple layered architecture:
- controller layer for handling HTTP requests
- service layer for business logic
- DTOs for data transfer
- global exception handling

## Requirements

- Java Development Kit (JDK) 17
- Git
- Windows OS (for provided commands)

## Project Structure

src/main/java/com/example/demo
├── DemoApplication.java
├── controller
│   ├── HelloController.java
│   └── CalcController.java
├── service
│   └── GreetingService.java
├── dto
│   └── HelloResponse.java
└── exception
    └── ApiExceptionHandler.java

## How to Run the Application (Windows)

Open a terminal in the project root directory and run:


.\gradlew.bat bootRun
After successful startup, the application will be available at:

http://localhost:8080

API Endpoints (open in browser)

GET http://localhost:8080/api/ping

Returns a simple "pong" response to check that the server is running.

GET http://localhost:8080/api/hello?name=YourName

Returns a greeting message in JSON format.

GET http://localhost:8080/api/calc/sum?a=2&b=3

Returns the sum of two numbers.

GET http://localhost:8080/api/calc/div?a=10&b=0

Demonstrates error handling and returns HTTP 400.

Build JAR File

To build the executable JAR file, run:

.\gradlew.bat clean build


The generated JAR file will be located in:

build/libs/

Notes

The project uses Gradle Wrapper, so Gradle does not need to be installed separately.

No database is used in this project.

Java version 17 is required.

Author: Velkhiev Ibragim

Student project created as part of a learning assignment.
