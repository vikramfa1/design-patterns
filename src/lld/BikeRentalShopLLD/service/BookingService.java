package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.*;

import java.util.List;
import java.util.Random;

public class BookingService {
    List<Booking> bookingList;
    PriceService priceService;
    public BookingService(List<Booking> bookingList, PriceService priceService) {
        this.priceService = priceService;
        this.bookingList = bookingList;
    }
    public synchronized void book(Vehicle vehicle, Customer customer) {
        if(vehicle.getVehicleStatus()!=VehicleStatus.AVAILABLE) {
            throw new RuntimeException("vehicle not available to book");
        }
        Booking booking = new Booking();
        booking.setBookedVehicle(vehicle);
        booking.setBookingId(new Random().nextInt());
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setPaymentStatus(PaymentStatus.PENDING);
        booking.setBookedVehicle(vehicle);
        booking.setBoookedCustomer(customer);
        vehicle.setVehicleStatus(VehicleStatus.BOOKED);

        booking.setBookingStatus(BookingStatus.INPROGRESS);
        bookingList.add(booking);

    }

    public void endRide(Booking booking) {

        if(booking.getBookingStatus()==BookingStatus.COMPLETED) {
            throw new RuntimeException("Ride already completed");
        }
        double priceToBePaid = priceService.calculatePrice(booking);
        System.out.println("Trip Ended. Outstanding amount to be paid: "+priceToBePaid);

        Payment payment = new Payment();
        payment.amtToBePaid = priceToBePaid;
        payment.paymentType = PaymentType.CREDITCARD;
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(payment);

        booking.setPaymentStatus(PaymentStatus.COMPLETED);
        booking.getBookedVehicle().setVehicleStatus(VehicleStatus.AVAILABLE);
        booking.setBookingStatus(BookingStatus.COMPLETED);

    }

}
