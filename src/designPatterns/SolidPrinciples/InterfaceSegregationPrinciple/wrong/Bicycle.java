package designPatterns.SolidPrinciples.InterfaceSegregationPrinciple.wrong;

import designPatterns.SolidPrinciples.LuskhovSubstitionPrinciple.exception.InvalidException;

public class Bicycle implements Bike {
    int speed;
    @Override
    public void turnEngineOn() {
        throw new InvalidException("engine not present in the vehicle");
    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("speed accelerated: "+speed);
    }
}
