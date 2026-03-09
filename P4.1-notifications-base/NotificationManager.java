public class NotificationManager {

    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void sendNotification(String message) {
        service.send(message);
    }
}