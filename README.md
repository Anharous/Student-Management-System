**🎓 Student CRUD Management System (Java + JDBC)**

A console-based Java application for managing student records using JDBC and MySQL.
The project follows a clean layered architecture (DAO → Service → Model) with input validation, custom exceptions, and utility classes, making it an excellent learning resource for structured Java development.

**📌 Features**

•Add new students

•Update student information

•Delete students by ID

•Get student by ID

•List all students

•Input validation and error handling

•Custom exceptions

•JDBC-based database operations

**🧱 Project Structure**

<img width="412" height="663" alt="image" src="https://github.com/user-attachments/assets/d54a0c91-9ddb-4266-bb82-e2dfb2c0ce32" />

**🛠 Technologies Used**

•Java 8+

•JDBC

•MySQL

•Maven

•Object-Oriented Programming (OOP)

**🚀 Getting Started**

1. Clone the repository
   
git clone https://github.com/yourusername/Student-CRUD.git

cd Student-CRUD

2. Configure the database
   
Update database credentials in:(URL,USER,PWD)

util/DBConnection.java


3.Create the student table:

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

4. Build the project

mvn clean install

5. Run the application

java -jar target/Student-CRUD.jar

Note: We can also Run the Projct by using run button in the code eitor.
