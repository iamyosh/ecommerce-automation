# E-Commerce Web Application Testing Framework

A comprehensive automation testing framework developed for the [Automation Exercise] e-commerce website using Selenium WebDriver, Java, TestNG, Postman and SQL validation concepts.

This project demonstrates key QA practices like:

* UI Automation Testing
* API Testing with Postman
* Manual Test Case design
* Bug Reporting
* Smoke Testing
* Regression Testing
* Database Validation with SQL
* Screenshot Evidence Collection
* Page Object Model (POM) design
* End-to-End E-Commerce Workflow Testing

---

## Project Objective

The objective of this project is to automate and validate core functionalities of an e-commerce application while applying real-world Software Quality Assurance techniques.

---

### Website tested
Automation Exercise:
[https://automationexercise.com/](https://automationexercise.com/)

---
# Tools & Technologies Used

### Automation Testing

* Selenium WebDriver
* Java
* TestNG
* Maven

### API Testing

* Postman
* REST API Validation

### Database Validation

* SQL Queries
* MySQL Concepts

### Other Tools

* Git & GitHub
* IntelliJ IDEA

---

## Testing Types Performed

* Functional Testing
* Smoke Testing
* Regression Testing
* API Testing
* UI Testing
* Negative Testing
* Database Validation

---

# Project Structure

```plaintext
src/
 ├── main/java/pages/
 │     ├── CartPage.java
 │     ├── ContactUsPage.java
 │     ├── Homepage.java
 │     ├── Loginpage.java
 │     ├── LogoutPage.java
 │     ├── PaymentPage.java
 │     ├── Productspage.java
 │     ├── SignupFormpage.java
 │     └── Signuppage.java
 │
 ├── test/java/tests/
 │     ├── BaseTest.java
 │     ├── CartTest.java
 │     ├── ContactUsTest.java
 │     ├── LoginTest.java
 │     ├── LogoutTest.java
 │     ├── PaymentTest.java
 │     ├── ProductsTest.java
 │     ├── SignupFormTest.java
 │     └── SignupTest.java
 │
docs/
 ├── bug-reports/
 │     ├── BUG-001-Login-Automation-Mismatch.md
 │     ├── BUG-002-Missing-Validation-for-Empty-Login-Fields.md
 │
 ├── test-cases/
 │     ├── TC-Cart-001.md
 │     ├── TC-Cart-002.md
 │     ├── TC-Cart-003.md
 │     ├── TC-Cart-004.md
 │     ├── TC-Checkout-Validation-001.md
 │     ├── TC-Checkout-Validation-002.md
 │     ├── TC-Login-001.md
 │     ├── TC-Login-002.md
 │     ├── TC-Login-003.md
 │     ├── TC-Search-001.md
 │
postman/
 ├── postman-collection-api-tests.json
 │
screenshots/
 ├── API-test-for-Invalid-Login.png
 ├── API-test-for-Search-Products.png
 ├── API-test-to-Get-Products.png
 ├── API-test-to-Verify-Login.png
 ├── BUG-001-failed-login.png
 ├── BUG-002-missing-validation.png
 ├── TC-002-Checkout-validation.png
 ├── TC-002-Checkout-validation-payment-details.png
 │
database-validation/
 ├── database-validation.md
 ├── validation-queries.sql
 │
README.md
pom.xml
```

---

# Automated Test Scenarios

### User Authentication

* Valid Login
* Invalid Login
* User Logout
* Duplicate Email Validation
* Signup Validation

### Product Testing

* Product Search
* Product Details Validation
* Add to Cart
* Remove from Cart

### Cart & Checkout Testing

* Cart Validation
* Checkout Validation
* Payment Validation
* Order Workflow Validation

### Contact Us Testing

* Contact Form Validation

---
# API Testing

API testing was performed using Postman for Automation Exercise APIs.

### APIs Tested

* Get All Products API
* Search Product API
* Verify Login API
* Invalid Login Validation

### API Validations Performed

* Status code validation
* Response body validation
* Authentication validation
* Negative testing
* Product data verification

### Postman Collection

The exported Postman collection is available inside:

```plaintext
postman/
```

---

# Database Validation

SQL validation queries were created to demonstrate backend data validation concepts.

## Database Checks Performed

* User registration validation
* Duplicate email validation
* Product validation
* Order validation
* Cart validation
* Payment validation

### SQL Validation File

```plaintext
database-validation/validation-queries.sql
```

---

# Bug Reports

Professional bug reports were documented with:

* Bug ID
* Summary
* Environment
* Expected result
* Actual result
* Severity
* Priority
* Status
* Evidence

### Sample Bugs Reported

* Failed login issue
* Missing validation issue

---

## Screenshots & Evidence

Testing evidence and execution screenshots are included inside:

```plaintext
screenshots/
```

## Included Evidence

* API testing screenshots
* Test case screenshots
* Bug evidence screenshots

---

# How to Run the Project

### Prerequisites

Install the following:

* Java JDK 17+
* Maven
* Chrome Browser
* IntelliJ IDEA

---

### Clone Repository

```bash
git clone https://github.com/iamyosh/ecommerce-automation.git
```

---

### Open Project

Open the project using IntelliJ IDEA.

---

### Install Dependencies

Maven dependencies will be downloaded automatically.

Or run:

```bash
mvn clean install
```

---

### Run Test Cases

Run individual TestNG test classes from:

```plaintext
src/test/java/tests/
```

Or run all tests using:

```bash
mvn test
```

---