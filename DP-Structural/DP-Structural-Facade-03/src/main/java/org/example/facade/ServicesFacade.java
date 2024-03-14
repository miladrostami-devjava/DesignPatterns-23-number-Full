package org.example.facade;

import org.example.interfaces.MessagingService;
import org.example.service.EmailService;
import org.example.service.PushNotificationService;
import org.example.service.SMSService;

public class ServicesFacade {
    private final SMSService smsService;
    private final EmailService emailService;
    private final PushNotificationService pushNotificationService;

    public ServicesFacade() {
        smsService = new SMSService();
        emailService = new EmailService();
        pushNotificationService = new PushNotificationService();
    }
    public void setSmsService(String message, String recipient){
        smsService.sendMessage(message, recipient);
    }
    public void setEmailService(String message, String recipient){
        emailService.sendMessage(message, recipient);
    }
    public void setPushNotificationService(String message, String recipient){
        pushNotificationService.sendMessage(message, recipient);
    }




}
