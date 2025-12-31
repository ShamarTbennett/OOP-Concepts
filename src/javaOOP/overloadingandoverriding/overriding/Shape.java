package javaOOP.overloadingandoverriding.overriding;

public class Shape {
     void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}