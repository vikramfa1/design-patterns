package designPatterns.SolidPrinciples.OpenClosePrinciples.wrong;

public class Main {

    public static void main(String args[]) {
        Notification notification = new NotificationService();
        notification.sendNotificationToSmS();
        notification.sendNotificationToEmail();
    }
}
