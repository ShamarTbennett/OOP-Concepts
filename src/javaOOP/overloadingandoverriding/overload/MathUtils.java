package javaOOP.overloadingandoverriding.overload;

class MathUtils {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.multiply(2, 3));      // 6
        System.out.println(m.multiply(2, 3, 4));   // 24
    }
}
