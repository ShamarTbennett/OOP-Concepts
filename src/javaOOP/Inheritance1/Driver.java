package javaOOP.Inheritance1;

public class Driver {
    public static void main(String[] args) {
    //create a new Animal object
    Animal A = new Animal();
    //Invoke its eat method
    A.Eat();

    //Create a new Bird object
    //Note the 3.5f indicates a float value
    Bird B  = new Bird(4, 3.5f);
    //Invoke its eat method
    B.Eat();
    //Invoke its eat method
    B.Fly();
    //Invoke its eat method
    B.Display();
    
    //Create a new Bird object
    //Note the 50.0f and 8.0f indicates float values
    Cow C  = new Cow(50.0f, 8.0f);
    //Invoke its eat method
    C.Eat();
    //Invoke its eat method
    C.Walk();
    //Invoke its eat method
    C.Display();
    }
}
