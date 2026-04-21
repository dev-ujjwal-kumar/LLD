package org.example.solid_principles.dip.bad_code;

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
        EmailService es = new EmailService(msg);
        es.sendEmail();
    }

    public void notifyBySMS(String msg) {
        SMSService sms = new SMSService(msg);
        sms.sendSMS();
    }
}
