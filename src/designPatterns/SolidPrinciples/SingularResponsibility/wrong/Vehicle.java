package designPatterns.SolidPrinciples.SingularResponsibility.wrong;

public interface Vehicle {

    public void accelerate(int speed);
    public void switchGear(int gear);
    public void applyBreak();
    //adding new functionality related to fly();
    public void fly();
}
