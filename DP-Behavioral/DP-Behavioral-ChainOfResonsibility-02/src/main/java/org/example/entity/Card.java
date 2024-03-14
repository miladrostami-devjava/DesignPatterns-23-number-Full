package org.example.entity;

public class Card extends PaymentHandler{
    @Override
    public void process(int amount) {
        if (amount <= 100_000){
            System.out.println("Payment process of " + amount + "by $ 'card' handler!");
        }else {
            super.process(amount);
        }

    }
}
