package OCP.BetterCode;

public class Main {
    public static void main(String[] args) {
        NotificatoinService email = new EMAILservice();
        Notification notification = new Notification(email);
        notification.showService("All its Done");


    }
}
