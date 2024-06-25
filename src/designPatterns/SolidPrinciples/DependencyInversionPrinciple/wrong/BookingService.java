package designPatterns.SolidPrinciples.DependencyInversionPrinciple.wrong;

import designPatterns.SolidPrinciples.DependencyInversionPrinciple.right.CardPaymentService;
import designPatterns.SolidPrinciples.DependencyInversionPrinciple.right.PaymentService;
import designPatterns.SolidPrinciples.DependencyInversionPrinciple.right.PaymentServiceFactory;
import designPatterns.SolidPrinciples.DependencyInversionPrinciple.right.WalletPaymentService;

import java.util.UUID;

public class BookingService {

    PaymentService paymentService;
    public void performBooking(String hotelName, int noOfRooms, double totalAmt, String paymentOption) {
        //booking service is completely depend on concrete payment service impl rather than interface
        //booking service is tightly coupled in payment service
        if(paymentOption=="card")
            paymentService = new CardPaymentService();
        else if(paymentOption == "wallet")
            paymentService = new WalletPaymentService();
        paymentService.doPayment(UUID.randomUUID().toString(), totalAmt);
    }
}
