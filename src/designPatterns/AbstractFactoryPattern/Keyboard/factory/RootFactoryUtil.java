package designPatterns.AbstractFactoryPattern.Keyboard.factory;

public class RootFactoryUtil {

    public static SystemFactory getRootFactory(SystemEnums enums) {
        if(enums.equals(SystemEnums.MACOS)) {
            return new MacSystemFactory();
        }
        if(enums.equals(SystemEnums.WINDOWS)) {
            return new WindowsSystemFactory();
        }
        return null;
    }
}
