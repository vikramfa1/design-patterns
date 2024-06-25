package designPatterns.SolidPrinciples.LuskhovSubstitionPrinciple.right;

public class MotorCycle implements Bike {
    public boolean isEngineOn;
    public int speed;

    public void turnEngineOn() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed++;
    }
}
