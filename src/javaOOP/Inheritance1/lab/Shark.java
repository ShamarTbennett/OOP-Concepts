package javaOOP.Inheritance1.lab;

public class Shark extends Animal {
    
    private int numberOfTeeth;

    public Shark(int numberOfTeeth, float age){
        this.numberOfTeeth = numberOfTeeth;
        this.age = age;
    }

    public void Swim(){
        System.out.println("This shark is swimming");
    }

    public void Display(){
        System.out.println("This shark has " + numberOfTeeth + " teeth");
        System.out.println("This shark is " + age + " year old");
    }

}
