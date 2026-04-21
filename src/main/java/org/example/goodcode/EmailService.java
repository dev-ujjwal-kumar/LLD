package solid.lsp.dip.goodcode;

public class EmailService implements NotificationChannel {
    @Override
    public void notify(String msg) {
        // Bussiness logic
        System.out.println("Email sent with message: " + msg);
    }
}
