package javaOOP.Inheritance1.tutorial;

public class Alpha {
    
    protected double A;
    protected int B;

    //default constructors
    public Alpha(){
        this.A = 0.1;
        this.B = 0;
        System.out.println("\nThis is in Alpha default constructor");
    }

    public void G(){
        System.out.println("We are in Alpha G method");
    }
}
