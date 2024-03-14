package org.example.service;

import org.example.interfaces.MessagingService;

public class PushNotificationService implements MessagingService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("sending PushNotification to " +" " + recipient);
        System.out.println("message is  :" + message);
    }
}
