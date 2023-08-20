package designPatterns.AbstractFactoryPattern.Keyboard.factory;

import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Keyboard;
import designPatterns.AbstractFactoryPattern.Keyboard.factory.model.Mouse;

public interface SystemFactory {
    public Keyboard getKeyboard();
    public Mouse getMouse();
}
