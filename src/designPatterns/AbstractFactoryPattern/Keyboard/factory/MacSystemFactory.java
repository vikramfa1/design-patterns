package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.MacMouse;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.MacOsKeyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Mouse;

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
