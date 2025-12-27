package javaOOP.Inheritance1.tutorial;

public class Driver {
    
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.G();
    
        Betta b = new Betta(5,"Hello" , 2.1, 21);
        b.G();
        b.H();
        b.Show();

        Kappa k = new Kappa(5, "Kappa", 6.1, 15);
        k.G();
        k.I();
        k.Show();
    }

    
}
