package nfs;

public class NotificationService {
    private  NotificationFactory notificationFactory;
    public NotificationService(NotificationFactory notificationFactory){
        this.notificationFactory=notificationFactory;
    }
    public void SendNotification(Notification notification){
        NotificationChannel notificationChannel =notificationFactory.getNotificationChannel(NotificationType.EMAIL);
        notificationChannel.sendNotification(notification);
    }
}
