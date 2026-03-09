public class Main {

    public static void main(String[] args) {

        NotificationService emailService = NotificationFactory.createService("email");
        NotificationManager emailManager = new NotificationManager(emailService);
        emailManager.sendNotification("Hola por email");

        NotificationService smsService = NotificationFactory.createService("sms");
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.sendNotification("Hola por sms");

        NotificationService pushService = NotificationFactory.createService("push");
        NotificationManager pushManager = new NotificationManager(pushService);
        pushManager.sendNotification("Hola por push");
    }
}