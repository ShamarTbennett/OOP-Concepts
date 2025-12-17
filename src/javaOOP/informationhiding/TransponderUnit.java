package javaOOP.informationhiding;

public class TransponderUnit {
    
    private int totalUnits;

    //primary constructor
    public TransponderUnit(){
        totalUnits = 0;
    }

    //Default Constructor
    public TransponderUnit(int totalUnits){
        this.totalUnits = totalUnits;
    }

    //Copy constructor
    public TransponderUnit(TransponderUnit unit){
        totalUnits = unit.totalUnits;
    }


    public void send(){

    }

    public void recieve(){

    }

    public void display(){
        System.out.println("The number of units on the grid is " + totalUnits);
    }

    public void setTotalunits(int units){
        totalUnits = units;
    }

    public int getTotalUnits(){
        return totalUnits;
    }


}
