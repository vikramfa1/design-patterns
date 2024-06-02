package lld.BikeRentalShopLLD.model;

import lld.BikeRentalShopLLD.service.VehicleStatus;
import lld.BikeRentalShopLLD.service.ScooterVehicleType;

public abstract class Vehicle {

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ScooterVehicleType getVehicleType() {
        return scooterVehicleType;
    }

    public void setVehicleType(ScooterVehicleType scooterVehicleType) {
        this.scooterVehicleType = scooterVehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    int vehicleId;
    String vehicleNo;
    Category category;

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    String vehicleModel;
    ScooterVehicleType scooterVehicleType;
    String model;
    double price;

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    VehicleStatus vehicleStatus;
}
