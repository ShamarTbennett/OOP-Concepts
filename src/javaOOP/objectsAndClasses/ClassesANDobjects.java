package javaOOP.objectsAndClasses;

public class ClassesANDobjects {

    // Fields (state)
    private String make;
    private String model;
    private int year;
    private int speed;

    // Constructor (initializes the object)
    public ClassesANDobjects(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0; // Start at 0 speed
    }

    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(make + " " + model + " accelerated to " + speed + " km/h");
    }

    // Method to brake
    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println(make + " " + model + " slowed down to " + speed + " km/h");
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model + ", Current Speed: " + speed + " km/h");
    }

    // Main method: demonstrates creating objects and using them
    public static void main(String[] args) {
        // Creating objects (instances) of the class
        ClassesANDobjects car1 = new ClassesANDobjects("Toyota", "Camry", 2020);
        ClassesANDobjects car2 = new ClassesANDobjects("Honda", "Civic", 2019);

        // Using methods on the objects
        car1.displayInfo();
        car1.accelerate(50);
        car1.brake(20);
        car1.displayInfo();

        System.out.println(); // Blank line

        car2.displayInfo();
        car2.accelerate(30);
        car2.accelerate(40);
        car2.brake(10);
        car2.displayInfo();
    }
}

