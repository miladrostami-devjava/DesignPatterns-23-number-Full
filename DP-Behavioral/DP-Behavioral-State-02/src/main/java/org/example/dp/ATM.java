package org.example.dp;

import org.example.state.ATMState;
import org.example.state.IdleState;

public class ATM {
private ATMState currentAtmState;

    public ATM() {
        currentAtmState = new IdleState();
    }
    public void changeState(ATMState state){
        currentAtmState = state;
    }
    public void displayState(){
        currentAtmState.insertCard();
    }
    public void insertCard(){
        currentAtmState.insertCard();
    }
    public void insertPin(int pin){
        currentAtmState.enterPin(pin);
    }
    public void enterAmount(double amount){
        currentAtmState.enterAmount(amount);
    }
    public void  withdrawCash(){
        currentAtmState.withdrawCash();
    }
}
