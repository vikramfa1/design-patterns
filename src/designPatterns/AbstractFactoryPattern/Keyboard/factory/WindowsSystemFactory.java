package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Mouse;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.WindowsKeyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.WindowsMouse;

public class WindowsSystemFactory implements SystemFactory{
    @Override
    public Keyboard getKeyboard() {
        return new WindowsKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new WindowsMouse();
    }
}
