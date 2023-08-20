package designPatterns.AbstractFactoryPattern.Keyboard.factory;

public class App {

    public static void main(String args[]) {
        SystemFactory factory = RootFactoryUtil.getRootFactory(SystemEnums.WINDOWS);
        factory.getKeyboard().pressControl();
        factory.getMouse().moveUp();

        SystemFactory macFactory = RootFactoryUtil.getRootFactory(SystemEnums.MACOS);
        macFactory.getKeyboard().pressControl();
        macFactory.getMouse().moveUp();
    }
}
