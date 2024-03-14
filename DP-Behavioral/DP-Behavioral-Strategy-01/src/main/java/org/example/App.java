package org.example;

import org.example.dp.context.NotificationService;
import org.example.dp.services.EmailNotification;
import org.example.dp.services.SMSNotification;
import org.example.model.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String message = "hello java developer";
        User milad = new User("mr80.mofi@gmail.com", "0098917502545", "t4t33r3r2t332t32yt32");
        NotificationService notification = new NotificationService(new SMSNotification());
        notification.send(milad,message);

    }
}
