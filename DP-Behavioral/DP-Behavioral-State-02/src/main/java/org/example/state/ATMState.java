package org.example.state;

public interface ATMState {
    void insertCard();
    void enterPin(int pin);
    void enterAmount(double amount);
    void withdrawCash();
}
