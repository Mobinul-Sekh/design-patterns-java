package behavioral.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin") && request.getPassword().equals("1234"));
        System.out.println("Authenticating...");
        return !isValid;
    }
}
