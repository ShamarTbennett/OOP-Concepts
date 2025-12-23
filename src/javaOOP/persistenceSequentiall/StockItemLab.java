package javaOOP.persistenceSequentiall;

public class StockItemLab {
    private int partNumber;
    private String description;
    private double price;

    public StockItemLab(){
        this.partNumber = 0;
        this.description = "white";
        this.price = 0.1;
    }

    public StockItemLab (int num, String des, double price){
        this.partNumber = num;
        this.description = des;
        this.price = price;
    }


    //Mutators
    public void setPartNumber(int partNumber){
        this.partNumber = partNumber;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //Accessors
    public int getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
}
