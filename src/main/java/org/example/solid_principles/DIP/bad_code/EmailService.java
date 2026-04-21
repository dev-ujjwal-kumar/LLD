package org.example.solid_principles.dip.bad_code;

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
