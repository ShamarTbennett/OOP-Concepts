package javaOOP.Inheritance1;

public class Bird  extends Animal {
    
    private int NumberEggsLaid;
    //primary constructor
    //expects initial value for NumberEggsLaid attribute which is in this class
    //plus the age attribute which is in the parent class
    Bird(int  NEL, float Ag)
    {
    NumberEggsLaid = NEL;
        age = Ag;
    }
    //Fly method
    public void Fly()
    {
        System.out.println("This bird is now flying");
    }
    //Display the value of the attributes
    public void Display()
    {
        System.out.println("This bird has laid "+NumberEggsLaid+" eggs");
        System.out.println("This bird is "+age+" years old");
    }
    
}
