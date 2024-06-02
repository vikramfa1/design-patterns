package lld.BikeRentalShopLLD.model;

import lld.BikeRentalShopLLD.service.ScooterVehicleType;

public class ScooterVehicle extends Vehicle {
    @Override
    public ScooterVehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVehicleType(ScooterVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ScooterVehicleType vehicleType;
}
