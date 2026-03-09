public class Main {

    public static void main(String[] args) {

        NotificationManager emailManager = new NotificationManager(new EmailService());
        emailManager.sendNotification("Hola por email");

        NotificationManager smsManager = new NotificationManager(new SMSService());
        smsManager.sendNotification("Hola por sms");

        NotificationManager pushManager = new NotificationManager(new PushService());
        pushManager.sendNotification("Hola por push");
    }
}