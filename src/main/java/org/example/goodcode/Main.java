package solid.lsp.dip.goodcode;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new NotificationService(new EmailService());
        emailNotificationService.sendNotification("Hello World!"); // works fine

        NotificationService smsNotificationService = new NotificationService(new SMSService());
        smsNotificationService.sendNotification("Hello World!"); // works fine

        return;
    }
}
