package javaOOP.objectsAndClasses;

public class Date {
    
    private int day;
    private int month;
    private int year;

    //Default constructor
    public Date(){
        day = 1;
        month = 1;
        year = 1999;
    }

    //Primary constrcutor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //copy constructor
    public Date( Date date){
        day = date.day;
        month = date.month;
        year = date.year;
    }
}
