package org.example;

import org.example.dp.NotificationMediator;
import org.example.dp.Order;
import org.example.dp.OrderNotification;
import org.example.dp.notif.emailNotification.EmailNotification;
import org.example.dp.notif.emailNotification.EmailNotificationImpl;
import org.example.dp.notif.pushNotification.PushNotification;
import org.example.dp.notif.pushNotification.PushNotificationImpl;
import org.example.dp.notif.smsNotification.SMSNotification;
import org.example.dp.notif.smsNotification.SMSNotificationImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmailNotification emailNotification = new EmailNotificationImpl();
        SMSNotification smsNotification = new SMSNotificationImpl();
        PushNotification pushNotification = new PushNotificationImpl();

        NotificationMediator notificationMediator = new
                OrderNotification(emailNotification,pushNotification,smsNotification);

        Order myOrder = new Order(notificationMediator);
        myOrder.placeOrder();

    }
}
