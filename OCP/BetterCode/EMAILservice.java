package OCP.BetterCode;

public class EMAILservice implements NotificatoinService{

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL"+message);
    }
}
