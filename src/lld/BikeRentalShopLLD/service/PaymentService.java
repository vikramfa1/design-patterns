package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Payment;
import lld.BikeRentalShopLLD.model.PaymentType;

public class PaymentService {
    public void processPayment(Payment payment) {
        if(payment.paymentType== PaymentType.CREDITCARD) {
            PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
            paymentStrategy.processPayment(payment);
        }
    }
}
