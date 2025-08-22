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



