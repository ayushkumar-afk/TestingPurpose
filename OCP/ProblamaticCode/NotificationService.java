package OCP.ProblamaticCode;

public class NotificationService {
    // NOW IF I WANT TO ADD ANY NEW SERVICE I NEED TO CHANGE IT HERE WHICH VOILATES THE OCP
    public void sendNotification(String type,String mesasge ){
        if(type.equals("EMAIL")) {
            System.out.println("Sending email"+mesasge);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS"+mesasge);
        } else if (type.equals("PUSH")) {
            System.out.println("Sending PUSH Notificatoin"+mesasge);
        }

    }
}
