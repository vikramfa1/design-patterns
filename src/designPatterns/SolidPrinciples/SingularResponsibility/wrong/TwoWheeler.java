package designPatterns.SolidPrinciples.SingularResponsibility.wrong;

public class TwoWheeler implements Vehicle {
    public String vehicle;
    public int speed;
    public TwoWheeler(String vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println(vehicle+" accelerating to the speed: "+ speed);
    }

    @Override
    public void switchGear(int gear) {
        System.out.println(vehicle+" switching to gear "+ gear);
    }

    @Override
    public void applyBreak() {
        if(this.speed>0)
            this.speed--;
        System.out.println(vehicle+" accelerating down: "+speed);
    }

    @Override
    public void fly() {
        //unncessarily need to implement this fly() function
    }
}
