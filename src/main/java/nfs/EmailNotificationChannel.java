package nfs;

public class EmailNotificationChannel  implements NotificationChannel{
    @Override
    public  void sendNotification(Notification notification) {
        System.out.println("email notification sent to "+notification.getRecipients());
    }
}
