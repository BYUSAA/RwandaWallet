RwandaWallet Application
RwandaWallet is a money transfer system that allows users to register, log in, check their balance, view transaction history, and transfer money to other users. It includes an admin panel where administrators can view all customer balances and track transfer histories.

Features
User Registration: Each user registers with their phone number and a PIN.
User Authentication: Users log in using their phone number and PIN.
Money Transfer: Users can transfer money to other registered users.
Balance Check: Users can check their current balance.
Transaction History: Users can view the history of their transfers.
Admin Dashboard: Admins can view all user balances and transaction history.
Technologies Used
Frontend: HTML, CSS, JavaScript
Backend: Java, Spring Boot
Database: PostgreSQL
Caching: Redis (planned for future implementation)
Prerequisites
Ensure you have the following installed:

Java 17+
Maven
PostgreSQL
IntelliJ IDEA or any preferred IDE
Postman for testing API endpoints
Project Structure
scss
Copy code
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
Database Setup
Install PostgreSQL and create a database named byussa.
Create the required tables by running the SQL script in PostgreSQL.sql:
sql
Copy code
CREATE DATABASE byussa;

-- Run the rest of the SQL commands in PostgreSQL.sql
Update your application.properties with your PostgreSQL credentials:
properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/byussa
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
Running the Application
Clone the repository:

bash
Copy code
git clone https://github.com/BYUSAA/RwandaWallet.git
Navigate to the project directory:

bash
Copy code
cd rwandawallet
Build the application using Maven:

bash
Copy code
mvn clean install
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
API Endpoints
User Endpoints
Send Money:

bash
Copy code
POST /api/transfer/send
Request Parameters:

fromPhoneNumber
toPhoneNumber
amount
pin
Check Balance: (Future)

bash
Copy code
GET /api/customer/balance
Admin Endpoints
View All Customer Balances:

bash
Copy code
GET /api/admin/all-balances
View All Money Transfers:

bash
Copy code
GET /api/admin/history
Future Enhancements
Add user authentication for the API.
Integrate Redis caching for faster balance retrievals.
Implement a frontend interface for users to interact with the application.