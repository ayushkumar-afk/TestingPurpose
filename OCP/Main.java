package OCP;

import OCP.ProblamaticCode.NotificationService;

//“Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("EMAIL","EMAIL SENDING DONE");
        notificationService.sendNotification("SMS","SMS SENDING DONE");
        notificationService.sendNotification("PUSH","PUSH DONE ");
    }
}
