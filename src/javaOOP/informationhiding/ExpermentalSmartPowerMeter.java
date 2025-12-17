package javaOOP.informationhiding;

//import javaOOP.informationhiding.TransponderUnit;

public class ExpermentalSmartPowerMeter{

    private String serialNumeber;
    private int electricityConsumption;
    private TransponderUnit transponder = new TransponderUnit();

    //primary constructor
    public ExpermentalSmartPowerMeter(){
        serialNumeber = "00000";
        electricityConsumption = 0;
        transponder = new TransponderUnit();
    }

    //Default constructor
    public ExpermentalSmartPowerMeter(String num, int con, int unit){
        this.serialNumeber = num;
        this.electricityConsumption = con;
        transponder.setTotalunits(unit);
    }

    //copy constructor
    public ExpermentalSmartPowerMeter(ExpermentalSmartPowerMeter ex){
        serialNumeber = ex.serialNumeber;
        electricityConsumption = ex.electricityConsumption;
        transponder.setTotalunits(ex.transponder.getTotalUnits());
    }

    public void increment(){
        ++electricityConsumption;
    }

    public void display(){
        System.out.println("This meter's serial number is " + serialNumeber );
        System.out.println("Electricity consumption is " +   electricityConsumption);
        System.out.println("Total transpondors online is " + transponder.getTotalUnits() + "\n");
    }

    public void setSerialNumber(String sNum){
        serialNumeber = sNum;
    }
    public void setElectricityConsumption(int con){
        electricityConsumption = con;
    }
    public void setTransponder(TransponderUnit unit){
        transponder = unit;
    }

    // Getters
    public String getSerialNumber(){
        return serialNumeber;
    }

    public int getElectricityConsumption(){
        return electricityConsumption;
    }

    public TransponderUnit getTransponder(){
        return transponder;
    }
    
}
