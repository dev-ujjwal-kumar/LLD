package org.example.solid_principles.dip.bad_code;

public class SMSService {
    private String msg;
    public SMSService(String msg) { 
        this.msg = msg;
    }

    public void sendSMS() {
        // code to send SMS
        System.out.println("SMS sent with message: " + msg);
    }
}
