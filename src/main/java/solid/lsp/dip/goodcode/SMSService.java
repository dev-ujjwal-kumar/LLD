package solid.lsp.dip.goodcode;

public class SMSService implements NotificationChannel {
    @Override
    public void notify(String msg) {
        // Bussiness logic
        System.out.println("SMS sent with message: " + msg);
    }    
}
