package javaOOP.Inheritance1.lab;

public class Animal {
        
    protected float age;
    //Default constructor
    public Animal()
    {
        age = 0;
        System.out.println("\nA new animal was just created");
    }
    //Eat method
    public void Eat()
    {
        System.out.println("Like every animal, this one can eat");
    }
}