package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Category;

public interface CategoryClassification<T> {
    public Category classify(T obj);

}
