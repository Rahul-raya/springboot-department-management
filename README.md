# Spring Boot Department Management

A simple **Spring Boot CRUD application** for managing departments.  
This project demonstrates how to build a layered Spring Boot application using **Controller, Service, Repository**, and proper **Exception Handling** with **MySQL Database**.

---

## 🚀 Features
- Add a new Department  
- Get Department by ID  
- Get all Departments  
- Update Department details  
- Delete a Department  
- Exception handling with custom error messages  

---

## 🛠️ Tech Stack
- **Java 17+**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **MySQL**  
- **Maven**  

---
## 📂 Project Structure

```
src/main/java/com/example/Springbootpractice
│
├── Controller
│ ├── DepartmentController.java
│ └── HelloController.java
│
├── entity
│ ├── Department.java
│ └── ErrorMessage.java
│
├── repository
│ └── DepartmentRepository.java
│
├── service
│ ├── DepartmentService.java
│ └── DepartmentServiceimp.java
│
├── Error
│ ├── DeptNotFoundException.java
│ └── RestResponseEntityExceptionHandler.java
│
└── SpringbootpracticeApplication.java

```

---

## ⚡ Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/springboot-department-management.git
cd springboot-department-management
```

2️⃣ Configure MySQL Database

Update your src/main/resources/application.properties with your DB credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/departmentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```
Make sure you create the database first in MySQL:
```
CREATE DATABASE departmentdb;
```
3️⃣ Build & Run the application
```
mvn spring-boot:run

```
---
🔗 API Endpoints
| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| POST   | `/departments`      | Add a new department    |
| GET    | `/departments`      | Get all departments     |
| GET    | `/departments/{id}` | Get department by ID    |
| PUT    | `/departments/{id}` | Update department by ID |
| DELETE | `/departments/{id}` | Delete department by ID |

---
🧪 Testing

JUnit test cases are included for:

Controller layer

Service layer

Repository layer

Run tests with:
```
mvn test
```

👨‍💻 Author
Raya Veera Venkata Naga Rahul Reddy


