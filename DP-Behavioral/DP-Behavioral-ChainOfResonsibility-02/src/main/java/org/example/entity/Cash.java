package org.example.entity;

public class Cash extends PaymentHandler {
    @Override
    public void process(int amount) {
        if (amount <= 50_000){
            System.out.println("Payment process of " + amount + "by $ 'cash' handler!");
        }else {
            super.process(amount);

        }
    }
}
