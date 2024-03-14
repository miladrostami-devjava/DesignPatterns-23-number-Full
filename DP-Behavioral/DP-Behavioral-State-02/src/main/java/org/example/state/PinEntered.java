package org.example.state;

public class PinEntered implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("card already inserted!");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin inserted : " + pin);

    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("entered amount :" + amount);
    }

    @Override
    public void withdrawCash() {
        System.out.println("please enter amount first!");

    }
}
