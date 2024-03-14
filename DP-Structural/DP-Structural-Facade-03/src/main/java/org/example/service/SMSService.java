package org.example.service;

import org.example.interfaces.MessagingService;

public class SMSService implements MessagingService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("sending SMS to " +" " + recipient);
        System.out.println("message is  :" + message);
    }
}
