package SOLID Principles.LSP.DIP.Bad Code;

// Problem with this design : Tight Coupling between NotificationService and EmailService, SMSService
// Testing is difficult as we cannot mock EmailService and SMSService
// Flexibility is reduced as we cannot add new notification channels without modifying NotificationService
// DIP is violated here.
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    // Consytructor
    public NotificationService(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void notifyByEmail(String msg) {
        emailService.sendEmail(msg);
    }

    public void notifyBySMS(String msg) {
        smsService.sendSMS(msg);
    }
}
