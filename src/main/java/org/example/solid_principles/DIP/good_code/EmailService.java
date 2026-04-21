package org.example.solid_principles.dip.good_code;

public class EmailService implements NotificationChannel {
    @Override
    public void notify(String msg) {
        // Bussiness logic
        System.out.println("Email sent with message: " + msg);
    }
}
