package javaOOP.overloadingandoverriding.overriding;

public class Car extends Vehicle {

    @Override
    void move() {
        super.move(); // call parent method
        System.out.println("Car drives on the road");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
