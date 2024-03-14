package org.example.dp.context;

import org.example.model.User;

public interface NotificationContext {
    void send(User receiver, String message);
}
