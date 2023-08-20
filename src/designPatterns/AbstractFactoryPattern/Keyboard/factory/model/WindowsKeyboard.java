package designPatterns.AbstractFactoryPattern.Keyboard.factory.model;


public class WindowsKeyboard implements Keyboard {
    @Override
    public void pressKeyUp() {
        System.out.println("windows Keyup");
    }

    @Override
    public void pressControl() {
        System.out.println("windows pressControl");
    }
}
