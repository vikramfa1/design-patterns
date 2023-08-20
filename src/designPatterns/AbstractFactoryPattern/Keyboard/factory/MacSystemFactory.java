package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.MacMouse;
import designPatterns.AbstractFactoryPattern.Keyboard.MacOsKeyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.Mouse;

public class MacSystemFactory implements SystemFactory{
    @Override
    public Keyboard getKeyboard() {
        return new MacOsKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new MacMouse();
    }
}
