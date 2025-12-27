package javaOOP.Inheritance1.tutorial;


public class Kappa extends Alpha{
    
    private float E;
    private String F;

    public Kappa(float e, String f,double a, int b){
        this.E = e;
        this.F = f;
        this.A = a;
        this.B = b;
    }
    
    public void I(){
        System.out.println("in the kappa file class");
    }

    public void Show(){
         System.out.println("A: " + A + "\nB: " + B +  "\nE: " + E + "\nF: "+ F);
    }
}
