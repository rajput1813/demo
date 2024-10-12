package nfs;

import java.util.Map;

public class NotificationFactory {
    private Map<NotificationType ,NotificationChannel>channels;
    public NotificationChannel getNotificationChannel(NotificationType notificationType){
        return channels.get(notificationType);

    }
    public void addNotificationChannel(NotificationChannel notificationChannel,NotificationType notificationType){
        channels.put(notificationType,notificationChannel);
    }
}
