package designPatterns.SolidPrinciples.OpenClosePrinciples.right;

public class EmailNotificationService implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending notification via Email");
    }

}
