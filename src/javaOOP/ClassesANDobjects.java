package javaOOP;

public class ClassesANDobjects {
    
    // state or field
    private int gear = 5;

    // behavior or method
    public void braking() {
        System.out.println("Working of Braking");
    }

    
}

public class Vains{

    public static void main(String[] args) {
        // create object
    ClassesANDobjects sportsBicycle = new ClassesANDobjects();

    // access field and method
    sportsBicycle.braking();
    }
}