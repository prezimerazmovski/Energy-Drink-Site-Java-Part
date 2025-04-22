# Energy Drink Site 
## Build with
- [Maven](https://maven.apache.org/) - Dependency Management.
- [SpringBoot](https://spring.io/projects/spring-boot) -Framework to ease the bootstrapping and development of new Spring Applications.
- [JDK](https://www.oracle.com/java/technologies/downloads/)- Java™ Platform, Standard Edition Development Kit.
- [H2](https://www.h2database.com/html/main.html)- Open-source, in memory lightweight Java database.
- [GIT](https://git-scm.com/)- Free and Open-Source distributed version control system.
 ## External Tools Used
  - [Postman](https://www.postman.com/)- API Development Environment (Testing Documentation)
  ## Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.breakingbad.Application class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open IDE
- File -> Import -> Navigate to the folder where you unzipped the zip
- Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right-Click on the file and Run as Java Application
  ## Description
  The Energy Drink Site is website that represent energy drinks like RedBull,Guarana,Monster and Hell,also describe their ingredients and their prices.In user interface part is created form which you need to insert  your data and that form with post request goes to database,also you can get all players from database with one click on -can button- and delete player with id  in specified field.
  ## Demo
  After you start the application the server will listen on port 8080
 - Get all players
  
   HTTP GET localhost:8080/players
 - Post players
  
   HTTP POST localhost:8080/players/add
 - Delete players
  
   HTTP DELETE localhost:8080/players/delete/{id}
