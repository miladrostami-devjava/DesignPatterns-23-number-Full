package org.example.dp.services;

import org.example.dp.context.NotificationContext;
import org.example.model.User;

public class EmailNotification implements NotificationContext {
    @Override
    public void send(User receiver, String message) {
        System.out.println("sending email from " + " " + receiver
        + "text is " +  " "  + message);
    }
}
