package designPatterns.AbstractFactoryPattern.Keyboard.factory.model;

public class MacMouse implements Mouse{

    @Override
    public void scroll() {
        System.out.println("mac mouse scroll");
    }

    @Override
    public void moveUp() {
        System.out.println("mac mouse up");
    }
}
