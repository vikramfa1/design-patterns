package lld.BikeRentalShopLLD.model;

import lld.BikeRentalShopLLD.service.BookingStatus;
import lld.BikeRentalShopLLD.service.PaymentStatus;

import java.util.Date;

public class Booking {

    int bookingId;
    BookingStatus bookingStatus;
    PaymentStatus paymentStatus;
    Vehicle bookedVehicle;
    Date bookedTimeStamp;

    public int getBookingDays() {
        return bookingDays;
    }

    public void setBookingDays(int bookingDays) {
        this.bookingDays = bookingDays;
    }

    int bookingDays;

    public Date getBookedTimeStamp() {
        return bookedTimeStamp;
    }

    public void setBookedTimeStamp(Date bookedTimeStamp) {
        this.bookedTimeStamp = bookedTimeStamp;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Vehicle getBookedVehicle() {
        return bookedVehicle;
    }

    public void setBookedVehicle(Vehicle bookedVehicle) {
        this.bookedVehicle = bookedVehicle;
    }

    public Customer getBoookedCustomer() {
        return boookedCustomer;
    }

    public void setBoookedCustomer(Customer boookedCustomer) {
        this.boookedCustomer = boookedCustomer;
    }

    Customer boookedCustomer;
}
