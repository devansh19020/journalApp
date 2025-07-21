# Journal App (Spring Boot)

## Overview

This project is a backend Journal App developed using **Spring Boot** and **MongoDB**. It allows users to create, read, update, and delete their personal journal entries. The app provides RESTful APIs to handle journal operations and user authentication, making it a useful learning project for backend development using Java and Spring Boot.

## Features

- **User Authentication:** Secure API endpoints for journal operations.
- **CRUD Operations:** Create, read, update, and delete journal entries.
- **RESTful APIs:** Well-structured endpoints for journal and user management.
- **MongoDB Integration:** Uses MongoDB for storing journal data.
- **Spring Security:** Ensures endpoints are protected and only accessible to authenticated users.
- **Scalable Structure:** Built using Maven for dependency management and modular development.

## Tech Stack

| Technology      | Purpose                                |
|-----------------|----------------------------------------|
| Java            | Programming language                   |
| Spring Boot     | REST API development                   |
| Spring Security | Authentication and authorization       |
| MongoDB         | Database for journal entries           |
| Maven           | Build automation and dependency mgmt   |

## Getting Started

### Prerequisites

- Java (version 17 or above recommended)
- Maven
- MongoDB installed and running locally or accessible remotely

### Installation

1. **Clone the repository:**
    ```
    git clone https://github.com/devansh19020/journalApp.git
    cd journalApp
    ```

2. **Configure MongoDB:**
    - Update the `application.properties` file with your MongoDB URI and other necessary configurations.

3. **Build the project:**
    ```
    mvn clean install
    ```

4. **Run the application:**
    ```
    mvn spring-boot:run
    ```
    The server should start on `http://localhost:8080` by default.

## API Endpoints (Example)

| Method | Endpoint              | Description                        |
|--------|-----------------------|------------------------------------|
| POST   | `/api/auth/register`  | Register a new user                |
| POST   | `/api/auth/login`     | Authenticate and obtain a token    |
| GET    | `/api/journals`       | Fetch all journal entries          |
| POST   | `/api/journals`       | Create a new journal entry         |
| PUT    | `/api/journals/{id}`  | Update an existing journal entry   |
| DELETE | `/api/journals/{id}`  | Delete a journal entry             |

> *Refer to your controller and model files for the exact route definitions.*

## Usage

1. **Register/Login:** Use authentication endpoints to create an account and obtain a token.
2. **Authorization Header:** Include your token in the `Authorization` header (e.g., `Bearer <token>`) for journal-related API requests.
3. **CRUD Operations:** Use tools like Postman or cURL to interact with the REST API for creating and managing your journal entries.

## Folder Structure

<pre>journalApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   ├── test/
├── pom.xml
└── README.md </pre>

## Contributing

This is a learning project. Feel free to fork the repo, suggest improvements, or report issues.

## License

This project is open source and free to use.

## Acknowledgements

Built while learning Spring Boot, MongoDB, and REST API development.

## Links

- [GitHub Repository](https://github.com/devansh19020/journalApp)
