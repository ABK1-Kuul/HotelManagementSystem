# Developer Guide & Academic Review Manual

Welcome to the internal guide for the **Hotel Management System**. This document is designed to assist developers and academic graders in understanding the underlying architecture, Object-Oriented principles, and data management strategies used in this project.

---

## 1. Core Architecture (MVC)
The project strictly follows the **Model-View-Controller (MVC)** architectural pattern to separate concerns and improve code maintainability.

*   **Models (`/classes`):** These are the core Domain Entities (`Person`, `Admin`, `Guest`, `Room`, `Booking`). They define the data structure and encapsulate the state of the hotel.
*   **Views (`/resources/pages/hotelmanagementjava`):** The `.fxml` files define the graphical user interface. They are decoupled from the logic and define the layout, structure, and IDs of the visual components.
*   **Controllers (`/pages/hotelmanagementjava`):** Java classes (e.g., `LoginController`, `RoomsController`) that act as the bridge between the View and the Model. They listen to UI events, process inputs, and update the Models or UI accordingly.

## 2. Object-Oriented Principles Applied
This project was developed with a strong focus on applying fundamental OOP principles. Graders should look for the following implementations:

### Inheritance
*   **Base Class:** `Person.java` acts as the superclass holding common attributes (`firstName`, `lastName`, `email`).
*   **Subclasses:** `Admin.java` and `Guest.java` inherit from `Person`. They reuse the base attributes and add specific ones (e.g., `username`/`password` for Admins, and `id` generation for Guests).

### Encapsulation
*   All state variables within Models (like `Room.roomCapacity` or `Booking.checkInDate`) are marked as `private`.
*   Access to these variables is strictly controlled through public **Getters** and **Setters**. This ensures the data cannot be arbitrarily modified from outside the object, maintaining state integrity.

### Polymorphism
*   Constructor chaining is utilized. When an `Admin` or `Guest` is instantiated, the `super(...)` keyword is dynamically used to invoke the parent `Person` constructor, allowing polymorphic initialization.

### Abstraction
*   Complex operations, such as how a `Booking` is structured or how a `Guest` ID is generated, are abstracted away from the UI Controllers. The Controller simply interacts with the high-level methods of the Objects.

---

## 3. Data Persistence Mechanism
To eliminate the need for an external database setup (like MySQL), this project utilizes **File-Based Persistence**. 

All data is stored in the `data/` directory using `.txt` files:
*   `admininfo.txt`: Stores administrator credentials.
*   `guestsinfo.txt`: Stores registered guest profiles.
*   `room.txt`: Stores room states (Type, Price, Availability).
*   `booking.txt`: Stores active reservation records.

Data is parsed using standard Java IO Streams (`BufferedReader` and `FileWriter`), making the application lightweight and entirely self-contained.

---

## 4. How to Compile and Run
This project uses **Maven** for dependency management. To compile and run the project from the source:

```bash
# 1. Clean previous builds and compile the project
mvn clean compile

# 2. Run the JavaFX Application
mvn javafx:run
```

Ensure your `JAVA_HOME` is set to **JDK 24** before running.
