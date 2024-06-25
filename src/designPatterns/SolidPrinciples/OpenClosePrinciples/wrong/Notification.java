package designPatterns.SolidPrinciples.OpenClosePrinciples.wrong;

public interface Notification {
    public void sendNotificationToSmS();
    //adding the email notification breaks the Open/Close principle
    //since we are modifying the defined class
    public void sendNotificationToEmail();
}
