package structural.facade;

// this is the facade class.
public class NotificationService {
    public  void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var auth = server.authenticate("appId", "key");
        server.send(auth, new Message(message), target);
        connection.disconnect();
    }
}
