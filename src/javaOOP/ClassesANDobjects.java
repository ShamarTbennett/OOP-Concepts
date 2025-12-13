package javaOOP;

public class ClassesANDobjects {
    
    // State (field): represents the gear of the bike
    private int gear = 5;

    // Behavior (method): simulates braking
    public void braking() {
        System.out.println("Working of Braking");
    }

    // Another method (note: there's a typo in "brakinsg" - it should be "braking")
    public void brakinsg() {
        System.out.println("Working of Braking");
    }

    // Main method: creates an object and demonstrates usage
    public static void main(String[] args) {
        // Creating an object (instance) of the class
        ClassesANDobjects bike = new ClassesANDobjects();
        
        // Calling a method on the object
        bike.braking();
        
        // Accessing a field of the object
        System.out.println("Gear of Bike: " + bike.gear);
    }
}

