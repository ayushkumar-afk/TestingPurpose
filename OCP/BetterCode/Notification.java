package OCP.BetterCode;

public class Notification {
    private NotificatoinService notificatoinService;



    public  Notification(NotificatoinService notificatoinService){
        this.notificatoinService = notificatoinService;
    }

    public void showService(String message){
        notificatoinService.send(message);
    }
}
