package javaOOP.Inheritance1;

public class Cow  extends Animal {
    private float MilkProduced;
    //primary constructor
    //expects initial value for MilkProduced attribute which is in this class
    //plus the age attribute which is in the parent class
    Cow(float  MP, float Ag)
    {
        MilkProduced = MP;
        age = Ag;
    }
    //Walk method
    public void Walk()
    {
        System.out.println("This cow is now walking");
    }
    //Display the value of the attributes
    public void Display()
    {
        System.out.println("This cow has produced "+MilkProduced+ " litres of milk");
        System.out.println("This cow is "+age+" years old");
    }
    
}
