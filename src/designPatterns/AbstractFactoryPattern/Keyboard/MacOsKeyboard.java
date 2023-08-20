package designPatterns.AbstractFactoryPattern.Keyboard;

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
