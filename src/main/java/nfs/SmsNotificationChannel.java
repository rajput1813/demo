package nfs;

public class SmsNotificationChannel implements NotificationChannel{
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("sms notification sent to "+notification.getRecipients());
    }
}
