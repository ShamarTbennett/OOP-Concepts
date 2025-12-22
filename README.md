## OOP Concepts in Java

This project demonstrates fundamental Object-Oriented Programming (OOP) concepts in Java through practical examples. The codebase is organized into several modules, each focusing on a specific OOP principle or technique.

## Project Structure

The main source code is located in the `src/javaOOP/` directory, with the following modules:

### ExceptionHandling
This module illustrates exception handling in Java, showing how to manage runtime errors gracefully.

- **ContainersNeededLab.java**: A program that calculates the number of retail containers needed based on wholesale container sizes. It demonstrates input validation, exception handling for invalid inputs (non-numeric, negative values), and arithmetic exceptions.
- **process.java**: A simpler example of division with exception handling for division by zero and invalid input types.

### informationhiding
This module demonstrates encapsulation and information hiding, core principles of OOP where data is protected and accessed through controlled interfaces.

- **ExpermentalSmartPowerMeter.java**: A class representing a smart power meter with private fields for serial number, electricity consumption, and a transponder unit. Includes constructors (default, parameterized, copy), getters/setters, and methods to increment consumption and display information.
- **TransponderUnit.java**: A supporting class for transponder units with encapsulated data and basic methods for communication simulation.
- **Main.java**: Demonstrates object creation using different constructors and displays the encapsulated data.

### objectsAndClasses
This module covers the basics of classes and objects in Java, showing how to define classes, create instances, and use methods.

- **ClassesANDobjects.java**: Implements a simple Car class with fields (make, model, year, speed), constructor, and methods for acceleration, braking, and displaying information. The main method creates multiple car objects and demonstrates their usage.
- **Date.java**: A Date class with private fields for day, month, and year, along with constructors (default, parameterized, copy) and getter/setter methods.
- **lab/**: Directory for additional lab exercises (currently empty).

### persistenceSequentiall
This module introduces data persistence through sequential file I/O operations.

- **sequential.java**: A class for user data management that demonstrates writing data to a text file sequentially. Includes constructors, a Store() method for saving user information to "User.txt", and placeholders for Retrieve() and Display() methods.

## Getting Started

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile the Java files using `javac` or your preferred IDE.
3. Run the individual classes to see the demonstrations.

For example, to run the exception handling examples:
```
javac src/javaOOP/ExceptionHandling/*.java
java -cp src javaOOP.ExceptionHandling.ContainersNeededLab
```

## Dependencies

This project uses only standard Java libraries and has no external dependencies.

## Contributing

This is an educational project demonstrating OOP concepts. Feel free to extend the examples or add new modules for other OOP principles.
