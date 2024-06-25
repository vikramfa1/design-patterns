package designPatterns.SolidPrinciples.OpenClosePrinciples.right;

public class SmsNotificationService implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending notification via SMS");
    }

}
