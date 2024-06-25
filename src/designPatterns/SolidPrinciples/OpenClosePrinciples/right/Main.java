package designPatterns.SolidPrinciples.OpenClosePrinciples.right;

public class Main {

    public static void main(String args[]) {
        Notification notification = NotificationFactory.getInstance(NotificationEnum.SMS_NOTIFICATION);
        notification.sendNotification();

        Notification emailNotification = NotificationFactory.getInstance(NotificationEnum.EMAIL_NOTIFICATION);
        emailNotification.sendNotification();
    }
}
