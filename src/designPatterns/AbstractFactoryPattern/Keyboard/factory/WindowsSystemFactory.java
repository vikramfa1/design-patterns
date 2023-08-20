package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.Mouse;
import designPatterns.AbstractFactoryPattern.Keyboard.WindowsKeyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.WindowsMouse;

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
