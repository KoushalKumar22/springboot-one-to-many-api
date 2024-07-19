# Spring-boot-one-to-many-api

This project demonstrates a simple Spring Boot application with a one-to-many bidirectional relationship between `Author` and `Books` entities. The application includes CRUD operations and allows testing through Postman.
## Features

- Save employee data to the database
- Retrieve all books of author
- Retrieve combines data by name or by id
- delete data by id

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- postgreSQL Database (for testing purposes)
- Maven

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/KoushalKumar22/springboot-one-to-many-api.git
   cd springboot-one-to-many-api

2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: '/test'

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save Author and his books
- URL: '/save'
- Method: POST
- Description: Save a new employee record to the database
- Request Body: json in postman
  ```sh
    {
        "author": "she",
        "books": [
            {
                "bookName": "c"
            },
            {
                "bookName": "java"
            },
            {
                "bookName": "python"
            }
        ]  
    }

3. Get All employee Records
- URL: '/all'
- Method: GET
- Description: Retrieve all authors records from the database
- Response: A list of authors and books
  
4. Get records by ID
- URL: '/id/{id}'
- Method: GET
- Description: Retrieve an author books by its ID
5. Get author by Name
- URL: '/author/{author}'
- Method: GET
- Description: Retrieve an author records by name


