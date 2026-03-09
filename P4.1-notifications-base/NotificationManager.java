public class NotificationManager {

    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
        System.out.println("[LOG] NotificationManager creado correctamente");
    }

    public void sendNotification(String message) {

        if (message == null || message.isEmpty()) {
            System.out.println("[ERROR] El mensaje no puede estar vacío");
            return;
        }

        System.out.println("[LOG] Preparando envío de notificación...");
        service.send(message);
        System.out.println("[LOG] Notificación enviada correctamente");
    }
}