package javaOOP.overloadingandoverriding.overload;

public class claculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        claculator calc = new claculator();
        System.out.println(calc.add(5, 10));      // 15
        System.out.println(calc.add(5, 10, 20));  // 35
    }

}
