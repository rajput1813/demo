package nfs;

public class SmsNotification implements Notification{
    private  final String recipient;
    private  final String message;

    public SmsNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String getRecipients() {
        return this.recipient;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }
}
