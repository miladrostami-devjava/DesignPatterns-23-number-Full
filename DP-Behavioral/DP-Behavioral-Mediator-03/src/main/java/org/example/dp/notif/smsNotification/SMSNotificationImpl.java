package org.example.dp.notif.smsNotification;

public class SMSNotificationImpl implements SMSNotification {
    @Override
    public void sendSMS(String phone, String message) {
        System.out.println("sms send to " + " " + phone +  "[" +message + "]");
    }
}
