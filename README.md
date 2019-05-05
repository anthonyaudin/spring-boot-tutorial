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

To run your application, using the command line just go to your project root and run: mvn spring-boot:run

Section 3:

To test this section use your browser to call your enpoint:

Testing of the @Qualifier annotation
http://localhost:8080/dog
http://localhost:8080/cat

Checking that dependencies can be injected through field, constructor or setter:
curl http://localhost:8080/autowiringOptions

Testing of scope differences:

Singleton scope difference, notice that the 2 different BeanScopeServiceTester beans resolve to the same SingletonComponent as incrementing the value for one service also increments it for the other one. (beanScopeTesterService2 is always 1 bigger than beanScopeTesterService1)
http://localhost:8080/singletonScopeDifference

Prototype scope difference, notice that the 2 different BeanScopeServiceTester beans resolve to 2 different PrototypeComponent as incrementing the value for one service does not increment it for the other one. (beanScopeTesterService1 is always equal to beanScopeTesterService2)
http://localhost:8080/prototypeScopeDifference

Session scope difference, acts the same as Singleton scope bean for a single session. Notice similar results compared to singleton scope bean. Then call the same url using curl and notice that the values are different as curl created a different session 
http://localhost:8080/sessionScopeDifference





 