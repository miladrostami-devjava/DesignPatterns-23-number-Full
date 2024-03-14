package org.example;

import org.example.entity.PaymentHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PaymentHandler paymentHandler = PaymentHandler.getPayment();

        paymentHandler.process(60_000);
        paymentHandler.process(600_000);
        paymentHandler.process(30_000);





    }
}
