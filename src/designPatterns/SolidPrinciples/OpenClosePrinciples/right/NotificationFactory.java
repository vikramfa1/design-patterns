package designPatterns.SolidPrinciples.OpenClosePrinciples.right;

public class NotificationFactory {

    public static Notification getInstance(NotificationEnum notificationEnum) {
        if(notificationEnum == NotificationEnum.SMS_NOTIFICATION) {
            return new SmsNotificationService();
        } else if(notificationEnum == NotificationEnum.EMAIL_NOTIFICATION) {
            return new EmailNotificationService();
        }
        return null;
    }
}
