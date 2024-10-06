Spring Multi-Module Project

This project consists of three modules: consumer, producer, and reactive-producer. Each module is a Spring Boot application with its own functionality.
Project Structure

The project structure is as follows:

```
SpringMultiModuleBasic/
├── consumer/
│   └── src/
│       └── main/
│           ├── java/
│           └── resources/
├── producer/
│   └── src/
│       └── main/
│           ├── java/
│           └── resources/
└── reactive-producer/
└── src/
└── main/
├── java/
└── resources/

```
Prerequisites
Java 17
Maven 3.6+

An IDE like IntelliJ IDEA
**Setup**
Clone the repository:  
git clone <repository-url>
cd SpringMultiModuleBasic
Build the project:  
mvn clean install

**Running the Applications :** 
_Consumer Module_

Navigate to the consumer directory:  
cd consumer
Run the application:  
mvn spring-boot:run

_Producer Module_

Navigate to the producer directory:  
cd producer
Run the application:  
mvn spring-boot:run

_Reactive Producer Module_

Navigate to the reactive-producer directory:  
cd reactive-producer
Run the application:  
mvn spring-boot:run

_Testing_
To run tests for any module, navigate to the module directory and execute:

mvn test

_Notes_
Ensure that the JAVA_HOME environment variable is set to the JDK 17 installation path.
Use the provided pom.xml files to manage dependencies and build configurations for each module.