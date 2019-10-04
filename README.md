# spring-boot-tutorial
Tutorial that will help you get familiar with the spring framework step by step


This tutorial is splitted into multiple sections, each section has its own branch. After you have cloned the project, just check out the branch of the section you are going through


Section 1 - Spring boot application creation

Section 2 - Exposing REST endpoints

Section 3 - Dependencies injections part 1

Section 4 - Dependencies injections part 2

Section 5 - Injecting values from a configuration file

Section 6 - Calling a remote web service

Section 7 - Interacting with a database using spring data

Section 8 - Exception handling

Section 9 - Testing our application


To run your application, using the command line just go to your project root and run: `mvn spring-boot:run`


Section 2:

To test this section simply use curl to call your endpoints:


To call basicGet() 

> curl http://localhost:8080


To call getWithPathParam(..)

> curl http://localhost:8080/12


To call basicGetWithHeader(..)

> curl -H "name: Foo" http://localhost:8080/withHeader


To call postWithRequest(..)

> curl -d '{"firstname":"John", "lastname":"Doe"}' -H "Content-Type: application/json" -X POST http://localhost:8080



 
