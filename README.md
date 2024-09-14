**RwandaWallet Application**

RwandaWallet is a money transfer system that allows users to register, log in, check their balance, view transaction history, and transfer money to other users. It includes an admin panel where administrators can view all customer balances and track transfer histories.

**Features**

_User Registration:_ Each user registers with their phone number and a PIN.

_User Authentication: _Users log in using their phone number and PIN.

_Money Transfer:_ Users can transfer money to other registered users.

_Balance Check:_ Users can check their current balance.

_Transaction History:_ Users can view the history of their transfers.

_Admin Dashboard:_ Admins can view all user balances and transaction history.

**Technologies Used**

_Frontend:_ HTML, CSS, JavaScript

_Backend:_ Java, Spring Boot

_Database:_ PostgreSQL

_Caching: _Redis (planned for future implementation)

**Prerequisites**

Ensure you have the following installed:
Java 17+
Maven
PostgreSQL
IntelliJ IDEA or any preferred IDE
Postman for testing API endpoints
Project Structure
scss

├── src

│   ├── main

│   │   ├── java

│   │   │   └── com.example.rwandawallet

│   │   │       ├── controller

│   │   │       │   ├── AdminController.java

│   │   │       │   ├── MoneyTransferController.java

│   │   │       │   └── CustomerController.java (future)

│   │   │       ├── model

│   │   │       │   ├── Admin.java (future)

│   │   │       │   ├── Customer.java

│   │   │       │   └── MoneyTransfer.java

│   │   │       └── repository

│   │   │           ├── AdminRepository.java

│   │   │           ├── CustomerRepository.java

│   │   │           └── MoneyTransferRepository.java

│   └── resources

│       ├── application.properties

├── pom.xml

└── README.md


**Database Setup**

Install PostgreSQL and create a database named byussa.
Create the required tables by running the SQL script in PostgreSQL.sql

SQL

CREATE DATABASE byussa;
-- Run the rest of the SQL commands in PostgreSQL.sql

Update your application.properties with your PostgreSQL credentials:
properties

spring.datasource.url=jdbc:postgresql://localhost:5432/byussa
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password

**Running the Application**

_Clone the repository:_

bash

git clone https://github.com/BYUSAA/RwandaWallet.git
Navigate to the project directory:

bash

cd rwandawallet


Build the application using Maven:

bash

mvn clean install
Run the Spring Boot application:

bash

mvn spring-boot:run


**API Endpoints**

**User Endpoints**

_Send Money:_

bash

POST /API/transfer/send
Request Parameters:
fromPhoneNumber
toPhoneNumber
amount
pin
_Check Balance: (Future)_

bash

GET /API/customer/balance


**Admin Endpoints**

View All Customer Balances:

bash

GET /API/admin/all-balances
View All Money Transfers:

bash

GET /API/admin/history


**Future Enhancements**

Add user authentication for the API.
Integrate Redis caching for faster balance retrievals.
Implement a frontend interface for users to interact with the application.
