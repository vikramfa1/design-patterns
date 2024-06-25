package designPatterns.SolidPrinciples.DependencyInversionPrinciple.wrong;

public class Main {

    public static void main(String args[]) {
        BookingService bookingService = new BookingService();
        bookingService.performBooking("ibis", 3, 500, "card");

        bookingService.performBooking("ibis", 2, 600, "wallet");
    }
}
