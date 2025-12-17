package javaOOP.informationhiding;

public class Main {
    
    public static void main(String[] args) {
        ExpermentalSmartPowerMeter a = new ExpermentalSmartPowerMeter();
        a.display();

        //create an object B calling the primary constructor 
        ExpermentalSmartPowerMeter B = new ExpermentalSmartPowerMeter("12345",500, 2);
        //Display the attributes values in object B
        B.display();
        
        //create an object C calling the copy constructor with B as a parameter 
        ExpermentalSmartPowerMeter C = new ExpermentalSmartPowerMeter(B);
        //Display the attributes values in object B
        C.display();
    }
}
