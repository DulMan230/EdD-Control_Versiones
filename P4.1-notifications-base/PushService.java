public class PushService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }

}