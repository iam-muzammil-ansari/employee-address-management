# Employee Address Management

## Table of Contents
- [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [Controller](#controller)
  - [Services](#services)
  - [Repository](#repository)
  - [Database Design](#database-design)
- [Data Structures Used](#data-structures-used)
- [Project Summary](#project-summary)
- [Getting Started](#getting-started)
- [Testing Endpoints](#testing-endpoints)
- [License](#license)

## Frameworks and Language Used
- Java
- Spring Boot
- Maven
- Dependencies are :
  - ```bash
    Spring Web
      ```
  - ```bash
    MySQL Driver
    ```
  - ```bash
    Swagger Ui
    ```
  - ```bash
    Spring Data JPA
    ```
  - ```bash 
    Lombok
    ```

## Data Flow

### Controller
- AddressController: Exposes REST endpoints for managing addresses.
- EmployeeController: Exposes REST endpoints for managing employees.

### Services
- AddressService: Implements business logic for address-related operations.
- EmployeeService: Implements business logic for employee-related operations.

### Repository
- IAddRepo: Interface for CRUD operations on the Address entity.
- IEmpRepo: Interface for CRUD operations on the Employee entity.

### Database Design
- The Address and Employee classes are annotated with `@Entity` to map them to database tables.
- Address and Employee entities are linked using a One-to-One relationship with a foreign key in the Employee entity.

## Data Structures Used
- Address: Represents an address with fields such as street, city, state, and zip code.
- Employee: Represents an employee with fields such as first name, last name, and an associated address.

## Project Summary
The Employee Address Management project provides functionality for managing employee data and their corresponding addresses. It allows creating, updating, deleting, and retrieving employees and addresses using RESTful APIs. The project is developed using Java and the Spring Boot framework, with data persistence handled by MySQL.

The project utilizes Spring Data JPA and Hibernate as the ORM (Object-Relational Mapping) tool to interact with the MySQL database. The Address and Employee classes are mapped to their respective database tables using annotations, and CRUD (Create, Read, Update, Delete) operations are performed using the provided repository interfaces.

The project's architecture follows a layered approach, with separate controller, service, and repository components. The controller classes define the REST endpoints for handling address and employee operations. The service classes encapsulate the business logic and interact with the repository interfaces to perform data operations. The repository interfaces provide the necessary methods for interacting with the MySQL database.

Additionally, the project incorporates Swagger, a powerful tool for API documentation. Swagger provides a user-friendly interface to browse and test the available endpoints, view request/response payloads, and explore the API's capabilities.

To get started with the project, you can clone the repository and configure the MySQL database connection in the application.properties file. After building and running the application, you can access the Swagger UI by visiting the specified URL (e.g., http://localhost:8080/swagger-ui.html). Swagger will present the available endpoints and allow you to interact with them directly through the UI.

Overall, the Employee Address Management project simplifies the management of employee data and addresses, leveraging the power of Java, Spring Boot, MySQL, and Swagger. It provides a seamless API experience with detailed documentation, making it easy to develop, test, and consume the exposed endpoints.

## Getting Started
To run the project locally, follow these steps:
1. Clone the [repository](https://github.com/ayaan097/employee-address-management.git).
2. Import the project into your preferred IDE.
3. Build the project using Maven or your IDE's build tools.
4. Configure the database connection in the application.properties file.
5. Run the application.

## Testing Endpoints
You can test the endpoints using tools like [Swagger](https://swagger.io/tools/swagger-ui) or [Postman](https://www.postman.com/).
- For Address:
  
  - To retrieve all addresses: `GET /Addresses`
  - To retrieve an address by ID: `GET /Addresses/{id}`
  - To create a new address: `POST /Addresses`
  - To update an address by ID: `PUT /Addresses/{id}`
  - To delete an address by ID: `DELETE /Addresses/{id}`

- For Employee:
  
  - To retrieve all employees: `GET /employees`
  - To retrieve an employee by ID: `GET /employees/{id}`
  - To create a new employee: `POST /employees`
  - To update an employee by ID: `PUT /employees/{id}`
  - To delete an employee by ID: `DELETE /employees/{id}`
  
## License
This project is not `licensed`.
