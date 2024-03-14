package org.example.dp;

import org.example.dp.enums.NotificationType;
import org.example.dp.notif.emailNotification.EmailNotification;
import org.example.dp.notif.pushNotification.PushNotification;
import org.example.dp.notif.smsNotification.SMSNotification;

public class OrderNotification implements NotificationMediator {
    private final EmailNotification emailNotification;
    private final PushNotification pushNotification;
    private final SMSNotification smsNotification;


    public OrderNotification(EmailNotification emailNotification, PushNotification pushNotification, SMSNotification smsNotification) {
        this.emailNotification = emailNotification;
        this.pushNotification = pushNotification;
        this.smsNotification = smsNotification;

    }


    @Override
    public void sendNotification(String recipient, String message) {
NotificationType notificationType =  determinePushNotification(recipient);
switch (notificationType){

    case SMS -> smsNotification.sendSMS(recipient, message);

    case EMAIL -> emailNotification.sendMessage(recipient, message);

    case PUSH -> pushNotification.sendNotification(recipient, message);

}

    }

    private NotificationType determinePushNotification(String recipient) {
        if (recipient.startsWith("+") || recipient.startsWith("09")
                || recipient.startsWith("0098")) {
            return NotificationType.SMS;
        } else if (recipient.startsWith("@") || recipient.startsWith("#")) {
            return NotificationType.EMAIL;
        } else {
            return NotificationType.PUSH;
        }

    }


}
