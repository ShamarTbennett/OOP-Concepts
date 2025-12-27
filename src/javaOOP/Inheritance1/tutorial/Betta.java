package javaOOP.Inheritance1.tutorial;

public class Betta extends Alpha{
    
    private int C;
    private String D;

    public Betta(int c, String d, double a, int b){
        this.C = c;
        this.D = d;
        this.A = a;
        this.D = d;
    }

    public void H(){
        System.out.println("We are in betta");
    }

    public void Show(){
        System.out.println("A: " + A + "\nB: " + B +  "\nC: " + C + "\nD: "+ D + "\n");
    }
}
