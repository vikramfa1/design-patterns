package designPatterns.SolidPrinciples.OpenClosePrinciples.wrong;

public class NotificationService implements Notification{

    @Override
    public void sendNotificationToSmS() {
        System.out.println("Sending notification via SMS");
    }

    @Override
    public void sendNotificationToEmail() {
        System.out.println("Sending notification via Email");
    }
}
