package nfs;

public interface Notification {
    //strategy design pattern
    String getRecipients();
    String getMessage();
    NotificationType getNotificationType();
}
