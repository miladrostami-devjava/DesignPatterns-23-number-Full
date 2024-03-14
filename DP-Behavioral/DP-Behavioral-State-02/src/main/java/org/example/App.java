package org.example;

import org.example.dp.ATM;
import org.example.state.AmountEntered;
import org.example.state.CardInserted;
import org.example.state.PinEntered;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ATM atm = new ATM();
        atm.insertCard();
        atm.changeState(new CardInserted());
        atm.insertPin(1234);
        atm.changeState(new PinEntered());
//        atm.enterAmount(2000000);
//        atm.changeState(new AmountEntered());
        atm.withdrawCash();

    }
}
