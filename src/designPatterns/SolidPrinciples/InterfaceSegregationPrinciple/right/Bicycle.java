package designPatterns.SolidPrinciples.InterfaceSegregationPrinciple.right;

public class Bicycle implements Cycle {
    int speed;

    @Override
    public void accelerate() {
        speed++;
        System.out.println("speed accelerated: "+speed);
    }
}
