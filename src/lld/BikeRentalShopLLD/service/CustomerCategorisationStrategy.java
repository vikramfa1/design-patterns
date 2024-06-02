package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Category;
import lld.BikeRentalShopLLD.model.Customer;

public class CustomerCategorisationStrategy implements CategoryClassification<Customer> {
    @Override
    public Category classify(Customer obj) {
        if(obj.getWeight()<50)  {
            return Category.SMALL;

        } else if(obj.getWeight()>50 && obj.getWeight()<75) {
            return Category.MEDIUM;
        } else {
            return Category.LARGE;
        }
    }
}
