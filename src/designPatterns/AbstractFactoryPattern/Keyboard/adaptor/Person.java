package designPatterns.AbstractFactoryPattern.Keyboard.adaptor;

public class Person {

    ElectricCar car;

    public void drive() {
        System.out.println("person driving");
        car.accelerate();
    }
}
