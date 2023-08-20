package designPatterns.AbstractFactoryPattern.Keyboard.factory.model;

public class MacOsKeyboard implements Keyboard{
    @Override
    public void pressKeyUp() {
        System.out.println("macOs Keyup");
    }

    @Override
    public void pressControl() {
        System.out.println("macOs pressControl");
    }
}
