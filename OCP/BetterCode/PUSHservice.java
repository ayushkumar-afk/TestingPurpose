package OCP.BetterCode;

public class PUSHservice implements NotificatoinService{

    @Override
    public void send(String message) {
        System.out.println("Sending SMS");
    }
}
