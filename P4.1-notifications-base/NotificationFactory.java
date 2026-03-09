public class NotificationFactory {

    public static NotificationService createService(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailService();
            case "sms":
                return new SMSService();
            case "push":
                return new PushService();
            default:
                return null;
        }
    }
}