# 🏨 Hotel Management System
> A comprehensive JavaFX application for managing hotel operations, designed for Object-Oriented Programming (OOP) excellence.

---

## 📖 Table of Contents
- [About the Project](#-about-the-project)
- [Key Features](#-key-features)
- [OOP Concepts Applied](#-oop-concepts-applied)
- [Technologies Used](#-technologies-used)
- [Architecture](#-architecture)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)

---

## 🏗 About the Project
The **Hotel Management System** is a desktop application developed to streamline the daily operations of a hospitality establishment. It provides an intuitive interface for administrators to manage guests, room allocations, bookings, and user profiles. This project was developed as part of an academic assignment to demonstrate profiency in **JavaFX** and **Object-Oriented Design Patterns**.

## ✨ Key Features
- **🔐 Admin Authentication**: Secure login system for authorized personnel.
- **🛋 Room Management**: View, add, and track availability of various room types.
- **👤 Guest Tracking**: Comprehensive database of guest information and history.
- **📅 Booking System**: Streamlined check-in/check-out process with real-time updates.
- **🛠 Profile Management**: Dynamic user profile updates and administrative control.
- **📊 Real-time Dashboard**: Overview of hotel occupancy and active guests.

## 🧩 OOP Concepts Applied
This project serves as a practical implementation of fundamental OOP principles:

- **Inheritance**: Utilizes a base `Person` class extended by specialized `Admin` and `Guest` classes, promoting code reusability.
- **Encapsulation**: Strict use of `private` access modifiers for attributes, with controlled access through public `Getters` and `Setters`.
- **Abstraction**: Logic is organized into modular services and controllers, hiding complexity from the presentation layer.
- **Polymorphism**: Demonstrates constructor overloading and dynamic method usage across inherited classes.
- **Modularity**: Separation of concerns between UI (FXML), Logic (Controllers), and Data (Models).

## 🛠 Technologies Used
- **Core**: [Java 24](https://www.oracle.com/java/)
- **GUI**: [JavaFX 24](https://openjfx.io/)
- **Build Tool**: [Maven](https://maven.apache.org/)
- **Persistence**: File-based Data Storage (`.txt` repository)
- **Styling**: Vanilla CSS for JavaFX

## 🚀 Getting Started

### Prerequisites
- **JDK 24** or higher
- **Maven 3.8+**

### Installation & Setup
1. **Clone the repository**:
   ```bash
   git clone [repository-url]
   cd Hotel-Management-JavaFX
   ```

2. **Clean and Install Dependencies**:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   ```bash
   mvn javafx:run
   ```

---

## 📂 Project Structure
```bash
src/main/java/pages/hotelmanagementjava/
├── classes/             # Domain Models (OOP Entities)
│   ├── Person.java      # Base Class
│   ├── Admin.java       # User Entity (Inherits Person)
│   ├── Guest.java       # Guest Entity (Inherits Person)
│   ├── Room.java        # Resource Entity
│   └── Booking.java     # Transaction Entity
├── Controllers/         # UI Logic & Event Handlers
└── Main.java            # Application Entry Point
```

---

## 👨‍💻 Author
**[Abdselam Kedir / 002/26]**
*Object-Oriented Programming Assignment*
*Submission Date: May17, 2026*

---
*Generated with ☕*
