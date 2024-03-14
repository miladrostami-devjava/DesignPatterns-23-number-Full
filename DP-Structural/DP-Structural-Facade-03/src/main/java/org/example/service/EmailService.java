package org.example.service;

import org.example.interfaces.MessagingService;

public class EmailService implements MessagingService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("sending Email to " +" " + recipient);
        System.out.println("message is  :" + message);
    }
}
