package designPatterns.AbstractFactoryPattern.Keyboard.adaptor;

public class App {

    public static void main(String args[]) {
        Person person = new Person();
        person.car = new ElectricCar();
        person.drive();

        person.car = new ManualCardAdaptor(new ManualCar());
        person.drive();
    }
}
