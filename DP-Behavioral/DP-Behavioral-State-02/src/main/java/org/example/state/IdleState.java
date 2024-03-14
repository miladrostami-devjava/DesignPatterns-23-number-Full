package org.example.state;

public class IdleState implements ATMState{
    @Override
    public void insertCard() {
        System.out.println("card inserted!");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Please insert card first!!!");
    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("Please insert card first!!!");

    }

    @Override
    public void withdrawCash() {
        System.out.println("Please insert card first!!!");

    }
}
