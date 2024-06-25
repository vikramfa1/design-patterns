package designPatterns.SolidPrinciples.DependencyInversionPrinciple.right;

import java.util.UUID;

public class BookingService {

    PaymentService paymentService;
    public void performBooking(String hotelName, int noOfRooms, double totalAmt, String paymentOption) {
        //booking service is not completely depend on concrete payment service
        //instead it used the interface of payment service
        //booking service is loosely coupled from payment service
        paymentService = PaymentServiceFactory.getInstance(paymentOption);
        paymentService.doPayment(UUID.randomUUID().toString(), totalAmt);
    }
}
