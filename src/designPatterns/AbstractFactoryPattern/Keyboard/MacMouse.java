package designPatterns.AbstractFactoryPattern.Keyboard;

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
