package javaOOP.overloadingandoverriding.overload;

public class Printer {
     void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Hello Java");
    }
}
