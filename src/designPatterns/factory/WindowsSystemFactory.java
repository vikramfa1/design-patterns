package designPatterns.factory;

import designPatterns.factory.model.Keyboard;
import designPatterns.factory.model.Mouse;
import designPatterns.factory.model.WindowsKeyboard;
import designPatterns.factory.model.WindowsMouse;

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
