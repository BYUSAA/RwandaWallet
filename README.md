"RwandaWallet: A Mobile Money Transfer System"
This project is a Java Spring Boot application that provides a backend for a mobile money transfer system in Rwanda. The system uses PostgreSQL/MySQL as the database and Redis for caching.

Table of Contents
Getting Started
Architecture
Endpoints
Database Schema
Redis Configuration
Environment Variables
Building and Running the Application
Testing
Contributing
License
Getting Started
These instructions will help you set up and run the application on your local machine.

Prerequisites
Java Development Kit (JDK) 8 or higher
Apache Maven 3.6.0 or higher
PostgreSQL/MySQL and Redis installed and running
Architecture
The application consists of the following components:

Backend Development: Java and Spring Boot are used to create the RESTful API.
Database Management: PostgreSQL/MySQL is used to store customer information, transactions, and other relevant data.
Caching: Redis is used to cache data for faster access.
Endpoints
The application provides the following endpoints:

POST /api/sendMoney: Send money from one customer to another.
GET /api/myBalance: Get the balance of a specific customer.
GET /api/myProfile: Get the profile information of a specific customer.
Database Schema
The application uses a customers table to store customer information. The schema is as follows:

sql

Verify

Open In Editor
Edit
Copy code
1CREATE TABLE customers (
2    id SERIAL PRIMARY KEY,
3    phone_number VARCHAR(20) NOT NULL,
4    name VARCHAR(50) NOT NULL,
5    pin INTEGER NOT NULL,
6    balance DECIMAL(10, 2) NOT NULL DEFAULT 10000000.00
7);
Redis Configuration
The application uses Redis for caching. The following configuration properties should be set:

properties

Verify

Open In Editor
Edit
Copy code
1spring.redis.host=localhost
2spring.redis.port=6379
3spring.redis.password=your_password
Environment Variables
The following environment variables should be set:

SPRING_DATASOURCE_URL: The URL for the PostgreSQL/MySQL database.
SPRING_DATASOURCE_USERNAME: The username for the PostgreSQL/MySQL database.
SPRING_DATASOURCE_PASSWORD: The password for the PostgreSQL/MySQL database.
Building and Running the Application
To build and run the application, follow these steps:

Clone the repository: git clone https://github.com/BYUSAA/RwandaWallet.git
Run mvn clean install to build the application.
Set the environment variables.
Run java -jar target/rwandawallet-0.0.1-SNAPSHOT.jar to start the application.
Testing
To run the tests, execute mvn test in the project directory.

Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

License
This project is licensed under the MIT License - see the LICENSE.md file for details.

Note: You can customize this README file to fit your specific needs and project requirements.
