package designPatterns.SolidPrinciples.SingularResponsibility.wrong;

public class Jet implements Vehicle{
    //Even though vehicle is not related to aircraft functionalities,
    // it has to be implemented
    @Override
    public void accelerate(int speed) {

    }

    @Override
    public void switchGear(int gear) {

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public void fly() {
        //only fly function is related
    }
}
