package org.example.dp.notif.emailNotification;

public class EmailNotificationImpl implements EmailNotification{
    @Override
    public void sendMessage(String email, String message) {
        System.out.println("email send to " + " " + email +  "[" +message + "]");
    }
}
