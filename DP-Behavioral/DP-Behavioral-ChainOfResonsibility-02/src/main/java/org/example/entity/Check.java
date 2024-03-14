package org.example.entity;

public class Check extends PaymentHandler{
    @Override
    public void process(int amount) {
        if (amount <= 200_000){
            System.out.println("Payment process of " + amount + "by $ 'card' handler!");
        }else {
            super.process(amount);
        }

    }
}
