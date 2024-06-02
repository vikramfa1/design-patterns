package designPatterns.factory;

import designPatterns.factory.model.Keyboard;
import designPatterns.factory.model.MacMouse;
import designPatterns.factory.model.MacOsKeyboard;
import designPatterns.factory.model.Mouse;

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
