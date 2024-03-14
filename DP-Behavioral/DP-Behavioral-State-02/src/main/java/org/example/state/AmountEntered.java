package org.example.state;

public class AmountEntered implements ATMState{
    @Override
    public void insertCard() {
        System.out.println("card already inserted!");

    }

    @Override
    public void enterPin(int pin) {
        System.out.println("pin already inserted!");

    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("amount already entered!");

    }

    @Override
    public void withdrawCash() {
        System.out.println("done withdraw cash!");
    }
}
