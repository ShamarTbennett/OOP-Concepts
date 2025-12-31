# OOP Concepts in Java

This project shows key Object-Oriented Programming (OOP) ideas in Java with simple code examples. Each folder focuses on one OOP topic. You can run the code to see how it works without reading every file.

## Project Setup

- Code is in `src/javaOOP/`.
- Use `javac` to compile and `java` to run.
- Example: `javac src/javaOOP/ExceptionHandling/*.java` then `java -cp src javaOOP.ExceptionHandling.ContainersNeededLab`

## Modules

### ExceptionHandling

Teaches how to handle errors in Java, like bad user input or math problems.

- **ContainersNeededLab.java**: Calculates containers needed, checks for bad inputs.
- **process.java**: Simple division with error checks.

### informationhiding

Shows encapsulation: hiding data and controlling access.

- **ExpermentalSmartPowerMeter.java**: Smart meter class with private data and methods.
- **TransponderUnit.java**: Helper class for communication.
- **Main.java**: Creates and shows meter objects.

### Inheritance1

Explains inheritance: subclasses get features from parent classes.

- **lab/**: Animal examples.
  - **Animal.java**: Base class with age and Eat().
  - **Bird.java, Cow.java, Shark.java**: Subclasses with extra actions like Fly() or Swim().
  - **Driver.java**: Creates animals and calls their methods.
- **tutorial/**: Another inheritance chain.
  - **Alpha.java**: Base with numbers and G().
  - **Betta.java, Kappa.java**: Subclasses with more methods.
  - **Driver.java**: Tests the classes.

### objectsAndClasses

Basics of classes and objects: blueprints and instances.

- **ClassesANDobjects.java**: Car class with speed and actions.
- **Date.java**: Date class with day/month/year.
- **lab/**: Empty for now.

### overloadingandoverriding

Covers method overloading (same name, different inputs) and overriding (subclass changes parent method).

- **overload/**: Overloading examples.
  - **claculator.java**: Add numbers with different counts.
  - **Converter.java**: Convert units (km to m, miles to km).
  - **MathUtils.java**: Multiply with 2 or 3 numbers.
  - **Printer.java**: Print int or string.
- **overriding/**: Overriding examples.
  - **Animal.java**: Base with makeSound().
  - **Car.java**: Extends Vehicle, overrides move().
  - **Vehicle.java**: Base with move().
  - **Shape.java**: Base with draw(), Circle overrides it.
  - **Dog.java, Employee.java**: More examples.

### persistenceSequentiall

Saving and loading data to/from files.

- **sequential.java**: User class, saves to User.txt.
- **StockItemLab.java**: Stock item class, saves to StockItem.txt with validation.

### Polymorphism

Objects act differently based on type, even with same method name.

- **Language.java**: Overriding example with displayInfo().
- **Pattern.java**: Overloading example with display() for patterns.
- **Polygon.java**: Shapes with render(), each does its own thing.

## Notes

- No extra libraries needed.
- Great for learning OOP step by step.
