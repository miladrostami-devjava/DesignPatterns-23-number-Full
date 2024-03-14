package org.example.dp.context;

import org.example.model.User;

public class NotificationService implements NotificationContext {
private final NotificationContext context;

    public NotificationService(NotificationContext context) {
        this.context = context;
    }

    @Override
    public void send(User receiver, String message) {
context.send(receiver, message);
    }
}
