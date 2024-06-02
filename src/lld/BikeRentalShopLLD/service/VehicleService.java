package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Category;
import lld.BikeRentalShopLLD.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleService {
    List<Vehicle> vehicleList;

    public VehicleService(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getAvailableVehicles(Category category) {
        return vehicleList.stream().filter((a) -> a.getCategory()==category && a.getVehicleStatus()==VehicleStatus.AVAILABLE).collect(Collectors.toList());
    }
}
