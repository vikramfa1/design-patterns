package lld.BikeRentalShopLLD.service;

import lld.BikeRentalShopLLD.model.Booking;

import java.util.Date;

public class PriceService {

    double perDayCost = 100;
    public double calculatePrice(Booking booking) {
        Date currentTimeStamp = new Date();
        double bookingCost=0;
        if(booking.getBookingStatus() == BookingStatus.INPROGRESS) {
            Date tripActualEndingDate = booking.getBookedTimeStamp();
                    //.after(booking.getBookingDays());
            bookingCost = booking.getBookingDays()*perDayCost;
            int val = currentTimeStamp.compareTo(tripActualEndingDate);
            if(val<=1) {
                bookingCost += val*2;
            } else if(val>1 && val<5) {
                bookingCost+= val*50;
            } else {
                bookingCost+= val*100;
            }
        }
        return bookingCost;
    }
}
