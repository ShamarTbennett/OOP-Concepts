package javaOOP.overloadingandoverriding.overriding;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal a = new Dog(); // polymorphism
        a.makeSound();       // Dog barks
    }
}
