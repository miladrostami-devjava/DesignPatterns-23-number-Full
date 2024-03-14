package org.example;

import org.example.facade.ServicesFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String message = "facade dps";
        String recipient = "tom";
        ServicesFacade servicesFacade = new ServicesFacade();
        servicesFacade.setSmsService(message,recipient);
        servicesFacade.setEmailService(message,recipient);

    }
}
