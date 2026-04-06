package SOLID Principles.LSP.DIP.Bad Code;

public class EmailService {
    private String msg;
    public EmailService(String msg) {
        this.msg = msg;
    }

    public void sendEmail() {
        // code to send email
        System.out.println("Email sent with message: " + msg);
    }
}
