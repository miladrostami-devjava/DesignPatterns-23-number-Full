package org.example.dp.notif.pushNotification;

public class PushNotificationImpl implements PushNotification{
    @Override
    public void sendNotification(String token, String message) {
        System.out.println(" send push notification to " + " " + token +  "[" +message + "]");

    }
}
