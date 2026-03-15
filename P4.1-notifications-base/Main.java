public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        NotificationService emailService = NotificationFactory.createService("email");
        NotificationManager emailManager = new NotificationManager(emailService);
        emailManager.sendNotification("Hola por email");

        NotificationService smsService = NotificationFactory.createService("sms");
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.sendNotification("Hola por sms");

        NotificationService pushService = NotificationFactory.createService("push");
        NotificationManager pushManager = new NotificationManager(pushService);
        pushManager.sendNotification("Hola por push");
=======
        // Creamos un nuevo manager
        NotificationManager manager = new NotificationManager();
        
        // Probamos todas las funcionalidades
        manager.send("email", "Bienvenido al sistema", "usuario@email.com");
        manager.send("sms", "Tu código es 1234", "+34123456789");
        manager.send("push", "Tienes un nuevo mensaje", "user_device_001");
>>>>>>> main
    }
}