package designPatterns.SolidPrinciples.SingularResponsibility.right;

public class FourWheeler implements Vehicle {
    int speed;
    String vehicle;
    public FourWheeler(String vehicle) {
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
}
