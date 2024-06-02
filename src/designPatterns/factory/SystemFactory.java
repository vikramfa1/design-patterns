package designPatterns.factory;

import designPatterns.factory.model.Keyboard;
import designPatterns.factory.model.Mouse;

public interface SystemFactory {
    public Keyboard getKeyboard();
    public Mouse getMouse();
}
