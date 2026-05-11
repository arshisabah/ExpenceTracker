# 🚀 Expense Tracker V1 (Core Java)

A beginner-friendly backend-focused Java project built using Core Java concepts and file handling.

This project helps understand how real backend systems manage data, business logic, persistence, and application structure before moving into frameworks like Spring Boot.

---

# 📌 Project Overview

Expense Tracker V1 is a console-based Java application that allows users to:

* Add expenses
* View all expenses
* Delete expenses
* Calculate total spending
* Persist data using text file storage
* Reload data automatically when application starts

The project follows a layered architecture approach similar to real backend applications.

---

# 🎯 Objectives

The main goal of this project is to learn:

* Core Java
* Object-Oriented Programming (OOP)
* Collections Framework
* File Handling
* Lambdas
* Encapsulation
* Service Layer Architecture
* Data Persistence
* Backend Project Structure

---

# 🛠️ Tech Stack

| Technology                      | Purpose                   |
| ------------------------------- | ------------------------- |
| Java 21                         | Core programming language |
| IntelliJ IDEA                   | Development IDE           |
| Maven                           | Project management        |
| ArrayList                       | In-memory data storage    |
| File Handling                   | Persistent storage        |
| BufferedReader / BufferedWriter | Efficient file operations |
| Lambda Expressions              | Functional operations     |

---

# 📂 Project Structure

```bash
ExpenseTracker-CoreJava/
│
├── data/
│   └── expenses.txt
│
├── src/
│   └── main/
│       └── java/
│           └── com.expensetracker/
│               ├── model/
│               │   └── Expense.java
│               │
│               ├── service/
│               │   └── ExpenseService.java
│               │
│               └── main/
│                   └── ExpenseTrackerApp.java
│
└── pom.xml
```

---

# 🧠 Architecture

## 🔹 Model Layer

### `Expense.java`

Represents an expense entity.

Contains:

* id
* title
* amount
* category

Responsibilities:

* Store expense data
* Provide getters
* Override `toString()` for readable output

---

## 🔹 Service Layer

### `ExpenseService.java`

Handles all business logic.

Responsibilities:

* Add expenses
* View expenses
* Delete expenses
* Calculate total spending
* Save data to file
* Load data from file

Concepts used:

* ArrayList
* Lambda expressions
* File handling
* Loops
* Business logic separation

---

## 🔹 Main Layer

### `ExpenseTrackerApp.java`

Acts as the entry point of the application.

Responsibilities:

* Display menu
* Accept user input
* Call service methods
* Control application flow

---

# 🔄 Application Workflow

```text
User Input
    ↓
Expense Object Created
    ↓
Stored in ArrayList
    ↓
Saved to expenses.txt
    ↓
Reloaded on next startup
```

---

# ⚙️ Features

## ✅ Add Expense

Allows users to add new expenses.

Example:

```text
ID: 1
Title: Pizza
Amount: 300
Category: Food
```

---

## ✅ View Expenses

Displays all stored expenses.

Example Output:

```text
ID: 1 | Title: Pizza | Amount: ₹300.0 | Category: Food
```

---

## ✅ Delete Expense

Deletes an expense using ID.

Implemented using:

```java
removeIf(expense -> expense.getId() == id)
```

---

## ✅ Show Total Spending

Calculates total amount spent.

Example:

```text
Total Spending: ₹1200.0
```

---

## ✅ File Persistence

Expenses are stored in:

```text
data/expenses.txt
```

Data automatically reloads when application starts.

---

# 💾 File Handling Workflow

## Saving Data

Expenses are converted into CSV format:

```text
1,Pizza,300.0,Food
```

Saved using:

* BufferedWriter
* FileWriter

---

## Loading Data

Data is read line-by-line using:

* BufferedReader
* FileReader

Then converted back into Expense objects.

---

# 🔥 Core Java Concepts Used

| Concept            | Usage                       |
| ------------------ | --------------------------- |
| Classes & Objects  | Expense entity              |
| Encapsulation      | Private variables + getters |
| Constructors       | Object initialization       |
| Method Overriding  | toString()                  |
| Collections        | ArrayList                   |
| Generics           | ArrayList<Expense>          |
| Lambdas            | removeIf()                  |
| File Handling      | BufferedReader/Writer       |
| Exception Handling | try-catch                   |
| Loops              | Traversing expenses         |
| OOP                | Project architecture        |

---

# 📌 Sample Execution

```text
===== Expense Tracker =====
1. Add Expense
2. View Expenses
3. Delete Expense
4. Show Total Spending
5. Exit
```

---

# 🚀 Future Enhancements

## Version 2

* Spring Boot REST APIs
* JSON responses
* Postman testing

## Version 3

* MySQL database integration
* JPA/Hibernate
* CRUD repository layer

## Version 4

* JWT Authentication
* User login system
* Role-based access

## Version 5

* Docker deployment
* Cloud hosting
* Microservices architecture

---

# 📈 Learning Outcomes

This project helped in understanding:

* Backend application structure
* Data persistence concepts
* Java collections and file handling
* Service layer architecture
* Real-world project organization
* Transition from Core Java to backend development

---

# 💡 Key Takeaways

This project is designed as a stepping stone toward advanced backend development using:

* Spring Boot
* REST APIs
* Databases
* Microservices

It focuses on building strong fundamentals before moving into enterprise frameworks.

---

# 👨‍💻 Author

ARSHI SABAH

Backend Development Journey using Java 🚀
