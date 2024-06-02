package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Payment;

public interface PaymentStrategy {
    public void processPayment(Payment payment);
}
