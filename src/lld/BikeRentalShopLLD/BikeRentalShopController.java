package lld.BikeRentalShopLLD;

import lld.BikeRentalShopLLD.model.Customer;
import lld.BikeRentalShopLLD.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class BikeRentalShopController {

    Map<String, Vehicle> listOfVehicles;
    Map<String, Customer> listOfCustomers;

    public BikeRentalShopController() {
        this.listOfVehicles = new HashMap<>();

    }
}
