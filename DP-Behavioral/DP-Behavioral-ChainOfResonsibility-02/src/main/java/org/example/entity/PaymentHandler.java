package org.example.entity;

public abstract class PaymentHandler {
    private PaymentHandler nextPayment;

    public void setNextPayment(PaymentHandler nextPayment) {
        this.nextPayment = nextPayment;
    }

    public void process(int amount){
        if (nextPayment != null){
            this.nextPayment.process(amount);
        }else {
            System.out.println("Request cannot be processed for  " + " " + amount + "$");
        }
    }

    public static PaymentHandler getPayment(){
PaymentHandler cash  = new Cash();
PaymentHandler card  = new Card();
PaymentHandler check = new Check();
cash.setNextPayment(card);
card.setNextPayment(check);

        return cash;
    }

}
