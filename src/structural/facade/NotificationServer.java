package structural.facade;

public class NotificationServer {
    public  Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken auth, Message message, String target) {
        System.out.println("sending the message...");
    }
}
