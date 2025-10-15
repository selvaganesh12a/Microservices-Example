# User Management System - Microservices Example

This is a Spring Boot microservices project demonstrating a scalable and modular architecture for a User Management System. It utilizes **Eureka Server/Client** for service discovery, **API Gateway** for routing, and **WebClient** for inter-service communication.

## Table of Contents
- Project Overview
- Architecture
- Technologies Used
- Services
- Setup and Installation
- Running the Application
- Usage
- Contributing
- License

## Project Overview
The User Management System is a demonstration of a microservices-based architecture built with Spring Boot. The project showcases how multiple microservices can communicate seamlessly using modern Spring Cloud components. Key features include:
- Service discovery using Eureka Server and Client.
- Centralized routing through an API Gateway.
- Inter-service communication using WebClient.
- Scalable and modular design for easy extension.

## Architecture
The project is structured as a collection of microservices, each responsible for a specific functionality within the User Management System. The main components are:
- **Eureka Server**: Acts as a service registry for discovering and managing microservices.
- **API Gateway**: Routes incoming requests to the appropriate microservice, providing a single entry point.
- **Microservices**: Individual services (e.g., User Service) that communicate using WebClient.
- **WebClient**: Facilitates HTTP-based communication between microservices.

## Technologies Used
- **Spring Boot**: Framework for building microservices.
- **Spring Cloud Netflix Eureka**: Service discovery and registration.
- **Spring Cloud Gateway**: API Gateway for routing requests.
- **Spring WebClient**: Reactive client for inter-service communication.
- **Java**: Programming language (version 17 or later recommended).
- **Maven**: Dependency management and build tool.
- **Docker** (optional): For containerized deployment.
- **MySQL/PostgreSQL** (optional): For persistent storage, if implemented.

## Services
The project includes the following microservices:
1. **Eureka Server**: Central registry for all microservices.
2. **API Gateway**: Entry point for external clients, routing requests to appropriate services.
3. **User Service**: Handles user-related operations (e.g., create, update, delete users).
4. **Email Service**: Handles the email-related operations(e.g., sending  mail).
   
Each service is an independent Spring Boot application registered with the Eureka Server.

## Setup and Installation
### Prerequisites
- Java 17 or later
- Maven 3.8.x or later
- Docker (optional, for containerized setup)
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Database (optional, e.g., MySQL or PostgreSQL)

### Steps
1. **Clone the Repository**
   ```bash
   git clone https://github.com/selvaganesh12a/Microservices-Example.git
   cd Microservices-Example
   ```

2. **Configure Dependencies**
   Ensure all services have the required dependencies in their respective `pom.xml` files. Run the following command to download dependencies:
   ```bash
   mvn clean install
   ```

3. **Set Up Configuration**
   - Update `application.yml` or `application.properties` files for each service to configure:
     - Eureka Server URL (e.g., `http://localhost:8761/eureka`).
     - Database connection details (if applicable).
     - API Gateway routes.
   - Example configuration for Eureka Server:
     ```yaml
     server:
       port: 8761
     eureka:
       client:
         register-with-eureka: false
         fetch-registry: false
     ```

4. **Database Setup** (if applicable)
   - Create a database (e.g., MySQL or PostgreSQL).
   - Update the service's `application.yml` with the database credentials.

## Running the Application
1. **Start the Eureka Server**
   Navigate to the Eureka Server module and run:
   ```bash
   mvn spring-boot:run
   ```
   Access the Eureka dashboard at `http://localhost:8761`.

2. **Start the API Gateway**
   Navigate to the API Gateway module and run:
   ```bash
   mvn spring-boot:run
   ```

3. **Start Other Microservices**
   For each microservice (e.g., User Service, Authentication Service), navigate to its directory and run:
   ```bash
   mvn spring-boot:run
   ```

4. **Verify Services**
   - Check the Eureka dashboard (`http://localhost:8761`) to ensure all services are registered.
   - Test API endpoints through the API Gateway (e.g., `http://localhost:8080/api/users`).

## Usage
- **Accessing the API**: Use tools like Postman or cURL to interact with the API Gateway.
  - Example: `GET http://localhost:8080/api/users` to retrieve users.
- **Service Communication**: Services use WebClient to communicate internally. For example, the User Service may call the Authentication Service to validate tokens.
- **Scaling**: Deploy multiple instances of a service and let Eureka handle load balancing.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes and commit (`git commit -m "Add your feature"`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
