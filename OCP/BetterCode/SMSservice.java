package OCP.BetterCode;

public class SMSservice implements NotificatoinService{

    @Override
    public void send(String message) {
        System.out.println("Sending SMS");
    }
}

