package org.example.solid_principles.dip.good_code;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String msg) {
        notificationChannel.notify(msg);
    }
}
