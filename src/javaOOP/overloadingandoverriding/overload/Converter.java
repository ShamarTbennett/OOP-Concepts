package javaOOP.overloadingandoverriding.overload;

public class Converter {
    void convert(int kilometers) {
        System.out.println(kilometers + " km = " + (kilometers * 1000) + " meters");
    }

    void convert(double miles) {
        System.out.println(miles + " miles = " + (miles * 1.60934) + " km");
    }

    public static void main(String[] args) {
        Converter c = new Converter();
        c.convert(5);
        c.convert(3.5);
    }
}
