# Employee CRUD Demo

## Overview
This is a CRUD (Create, Read, Update, Delete) web application built using Spring Boot and Thymeleaf templates to manage employee records. It utilizes a MySQL database for data storage and Bootstrap for styling.

## Features
- Create new employee records with relevant information.
- Read and display a table of all existing employees.
- Update employee information as needed.
- Delete employee records from the database.

## Architecture

The Employee Management System follows a layered architecture, ensuring separation of concerns and maintainability. Here's an overview of the architecture:

- **Web Browser**: The user interacts with the system through a web browser, accessing the graphical user interface (GUI).


- **EmployeeController**: The EmployeeController serves as the entry point for handling incoming HTTP requests.


- **EmployeeService**: The EmployeeService acts as a middle layer responsible for business logic and transaction management.


- **EmployeeDao**: The EmployeeDao is responsible for data access and communication with the database. 
It uses Spring Data JPA to interact with the MySQL database


This layered architecture promotes modularity and maintainability.

## Technologies Used
- **Spring Boot**: Provides the core framework for building the web application.
- **Thymeleaf Templates**: Used for rendering dynamic content on the web pages.
- **MySQL Database**: Stores and manages employee data.
- **Bootstrap**: Enhances the user interface with pre-designed CSS styles and components.

## Getting Started
1. Clone this repository to your local machine.

```bash
git clone https://github.com/antomili2002/employee-management.git
```
Set up a MySQL database and configure the database connection properties in src/main/resources/application.properties.
properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
```

## Usage
  
To interact with the Employee Management System GUI:

1. Launch the application on your local machine.
2. Navigate to the GUI interface in your web browser at [http://localhost:8080](http://localhost:8080).
3. Use the provided buttons and forms to perform CRUD operations on employee records.
4. Enjoy a user-friendly graphical interface for effortlessly managing employee data, all powered by the added benefits of AOP for logging and maintainability.

## AOP Integration

This project incorporates Aspect-Oriented Programming (AOP) to enhance functionality and maintainability. AOP is used for:

- **Logging Support**: Efficiently track and monitor actions and events within the system.
- **Pointcut Declarations**: Specify join points where AOP advice is applied.
- **@Before Advice**: Execute code before the target method is invoked.
- **@AfterReturning Advice**: Execute code after a target method successfully returns.

AOP promotes cleaner and more modular code by separating cross-cutting concerns, such as logging, from the core functionality of the REST API. 
Customize and extend the AOP aspects in this project as needed for your specific use case.