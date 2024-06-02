package designPatterns.adaptor;

public class ManualCardAdaptor extends ElectricCar{

    ManualCar manualCar;

    public ManualCardAdaptor(ManualCar manualCar) {
        this.manualCar = manualCar;
    }
    @Override
    public void accelerate() {
        manualCar.accelerate();
        manualCar.gear("up");
    }
}
