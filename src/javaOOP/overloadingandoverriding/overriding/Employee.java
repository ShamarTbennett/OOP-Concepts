package javaOOP.overloadingandoverriding.overriding;

public class Employee {
    
     void calculateSalary() {
        System.out.println("Calculating base employee salary");
    }
}
class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Calculating manager salary");
    }

    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateSalary(); // Calls Manager version
    }
}