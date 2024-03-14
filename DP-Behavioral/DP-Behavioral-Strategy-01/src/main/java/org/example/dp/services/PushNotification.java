package org.example.dp.services;

import org.example.dp.context.NotificationContext;
import org.example.model.User;

public class PushNotification implements NotificationContext {
    @Override
    public void send(User receiver, String message) {
        System.out.println("sending push from " + " " + receiver
        + "text is " +  " "  + message);
    }
}
