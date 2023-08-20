package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.Mouse;

public interface SystemFactory {
    public Keyboard getKeyboard();
    public Mouse getMouse();
}
