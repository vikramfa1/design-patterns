package designPatterns.factory.model;

public class WindowsMouse implements Mouse{
    @Override
    public void scroll() {
        System.out.println("windows mouse scroll");
    }

    @Override
    public void moveUp() {
        System.out.println("windows mouse moveUp");
    }
}
