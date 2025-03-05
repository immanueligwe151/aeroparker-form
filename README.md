# Aeroparker Form

The Aeroparker form is a simple form that was created as a means of displaying MVC (model-view controller) capabilities. This has been created as a Spring Boot application, using Java 17 as the backend, HTML and CSS as the frontend and MySQL as the database.

# Navigating the Project

The root folder of the project (from where it would be run) is located in the [parkerform](./parkerform/) directory. It runs locally on port 8080. The root path `/` automatically redirects to the `/registration` path, where there is a simple form for the user to fill out. Upon successful validation, the user is redirected to the `/success` path, where they will be greeted with a success message. If validation is unsuccessful, the form is reloaded to display the error message(s).

- You find the HTML templates [here](./parkerform/src/main/resources/templates/).
- CSS code can be found [here](./parkerform/src/main/resources/static/css/).
- Server-side Java pages can be found in the [`aeroparker\parkerform`](./parkerform/src/main/java/com/aeroparker/parkerform/) folder.

# Running the Web App on your Machine

This project has not deployed to a live server, and would needed to be run locally. To do so, please follow the following steps:

- Clone this repository.
- Create a local MySQL Server instance on your machine
- In that instance, run the SQL commands located in [this SQL file](./database_sql_commands.sql).
- Go to the [`application.properties`](./parkerform\src\main\resources\application.properties) file. Ensure that the values in brackets match your database name, user and password. If not, adjust as required.
``` Python
# MySQL Database Connection
spring.datasource.url=jdbc:mysql://localhost:3306/(aeroparker)?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=(springuser)
spring.datasource.password=(password)
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
- In your terminal run the following commands:
``` bash
mvn clean install
mvn spring-boot:run
```
- Then load the web application on `localhost:8080`.


# Credits

- Aeroparker image obtained from [Freepik](https://www.freepik.com/free-vector/airplane-cartoon-sticker-white-background_20771046.htm) on Tuesday 4 March 2025.