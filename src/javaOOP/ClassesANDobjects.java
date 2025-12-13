package javaOOP;

public class ClassesANDobjects {
    
    // state or field
    private int gear = 5;

    // behavior or method
    public void braking() {
        System.out.println("Working of Braking");
    }

    // behavior or method
    public void brakinsg() {
        System.out.println("Working of Braking");
    }

     //object creation
     public static void main(String[] args) {
        ClassesANDobjects bike = new ClassesANDobjects();
        bike.braking();
        System.out.println("Gear of Bike: " + bike.gear);
    
    }
}

