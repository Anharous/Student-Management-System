🎓 Student CRUD Management System (Java + JDBC)

A console-based Java application for managing student records using JDBC and MySQL.
The project follows a clean layered architecture (DAO → Service → Model) with input validation, custom exceptions, and utility classes, making it an excellent learning resource for structured Java development.

📌 Features
Add new students
Update student information
Delete students by ID
Get student by ID
List all students
Input validation and error handling
Custom exceptions
JDBC-based database operations

🧱 Project Structure
src/main/java/com/example
│
├── dao
│   ├── StudentDao.java
│   ├── StudentDaoImpl.java
│
├── service
│   ├── StudentService.java
│   ├── StudentServiceImpl.java
│
├── model
│   └── Student.java
│
├── exception
│   └── StudentNotFound.java
│
├── util
│   ├── DBConnection.java
│   ├── InputUtil.java
│   └── ValidationUtil.java
│
└── App.java

🛠 Technologies Used
Java 8+
JDBC
MySQL
Maven
Object-Oriented Programming (OOP)

🚀 Getting Started
1. Clone the repository
git clone https://github.com/yourusername/Student-CRUD.git
cd Student-CRUD

2. Configure the database
Update database credentials in:(URL,USER,PWD)
util/DBConnection.java


Create the student table:
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

3. Build the project
mvn clean install

4. Run the application
java -jar target/Student-CRUD.jar
