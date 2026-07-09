# 🚖 RideX - Smart Urban Mobility and Ride Booking System

A Full Stack Ride Booking and Urban Mobility Management System inspired by platforms like **Uber** and **Ola**, built using **Spring Boot**, **Spring Security**, **JWT Authentication**, **MySQL**, **HTML**, **CSS**, and **JavaScript**.

---

## 📖 Project Overview

RideX is a secure and scalable ride-booking application that enables customers to book rides, drivers to manage trips, and administrators to monitor the complete transportation system.

The project demonstrates end-to-end integration between the frontend, backend, and database while implementing modern authentication and role-based access control.

---

## ✨ Key Features

### 👤 Customer Module

- Customer Registration & Login
- Secure JWT Authentication
- Book a Ride
- Dynamic Fare Estimation
- Ride History
- Payment Management
- Driver Rating
- Profile Management

### 🚗 Driver Module

- Driver Login
- Accept / Reject Ride Requests
- OTP Verification
- Start & Complete Ride
- Earnings Dashboard
- Availability Status

### 🛠️ Admin Module

- Admin Dashboard
- Customer Management
- Driver Management
- Ride Monitoring
- Revenue Analytics
- System Reports

---

# 🔐 Security Features

- Spring Security
- JWT Authentication
- Role-Based Authorization
- Secure REST APIs
- Password Encryption

---

# 🛠️ Tech Stack

## Backend

- Java
- Spring Boot
- Spring MVC
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- REST APIs
- Maven

## Frontend

- HTML5
- CSS3
- JavaScript
- Fetch API
- Thymeleaf
- Leaflet.js
- OpenStreetMap

## Database

- MySQL

---

# 🏗️ Architecture

```
Frontend (HTML, CSS, JavaScript)
            │
            ▼
        REST APIs
            │
            ▼
Spring Boot Controllers
            │
            ▼
      Service Layer
            │
            ▼
    Repository Layer
            │
            ▼
      MySQL Database
```

---

# 🔄 Ride Lifecycle

```
REQUESTED
      │
      ▼
ACCEPTED
      │
      ▼
IN_PROGRESS
      │
      ▼
COMPLETED
      │
      ▼
PAYMENT
      │
      ▼
RATING
```

Cancelled Ride:

```
REQUESTED
      │
      ▼
CANCELLED
```

---

# 🔑 Authentication Flow

```
User Login
      │
      ▼
Spring Security
      │
      ▼
JWT Token Generated
      │
      ▼
Stored in Browser
      │
      ▼
Every Request Sends JWT
      │
      ▼
JwtFilter Validates Token
      │
      ▼
Authorized Access
```

---

# 📂 Project Structure

```
RideX
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── config
│   │   │   ├── controller
│   │   │   ├── dto
│   │   │   ├── entity
│   │   │   ├── repository
│   │   │   ├── security
│   │   │   ├── service
│   │   │   └── RideXApplication.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       ├── application.properties
│   │       └── ...
│   │
│   └── test
│
├── pom.xml
├── README.md
└── .gitignore
```

---

# 📊 Database Tables

- Customer
- Driver
- Ride

---

# 🚀 Features Implemented

- Secure Login & Registration
- JWT Authentication
- Role-Based Access
- Ride Booking
- OTP Verification
- Driver Assignment
- Ride Lifecycle Management
- Fare Estimation
- Ride Tracking
- Payment Handling
- Driver Ratings
- Ride History
- Earnings Dashboard
- Admin Analytics
- Responsive User Interface

---

# 📷 Screenshots

You can add screenshots in a `screenshots/` folder.

Suggested screenshots:

- Home Page
- Login Page
- Customer Dashboard
- Driver Dashboard
- Admin Dashboard
- Ride Booking
- Payment
- Ride History

---

# 📈 Diagrams

You can include:

- System Architecture Diagram
- Data Flow Diagram (DFD)
- Use Case Diagram
- Database Schema

---

# ⚙️ Installation

## Clone the Repository

```bash
git clone https://github.com/Kalyanr3/RideX---A-Smart-Urban-Mobility-System.git
```

## Navigate to the Project

```bash
cd RideX---A-Smart-Urban-Mobility-System
```

## Configure the Database

Create a MySQL database:

```sql
CREATE DATABASE ridex;
```

Update the database configuration in:

```
src/main/resources/application.properties
```

## Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

Open your browser and access the application.

---

# 🔮 Future Enhancements

- Google Maps API Integration
- Live GPS Tracking
- Online Payment Gateway Integration
- Push Notifications
- Email Notifications
- Ride Scheduling
- AI-Based Fare Prediction
- Docker Deployment
- AWS Cloud Deployment

---

# 👨‍💻 Author

**Kalyan Ram P S**

**Aspiring Java Full Stack Developer**

### Skills

- Java
- Spring Boot
- Spring Security
- REST APIs
- MySQL
- HTML
- CSS
- JavaScript

---

# 🤝 Contributing

Contributions, suggestions, and improvements are welcome. Feel free to fork the repository and submit a pull request.

---

# ⭐ Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.

---

# 📄 License

This project is intended for educational and portfolio purposes.
