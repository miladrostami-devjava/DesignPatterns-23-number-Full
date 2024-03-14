package org.example;

import org.example.dp.BankTransaction;
import org.example.trx.Deposit;
import org.example.trx.Withdrawal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BankTransaction deposit = new Deposit();
        deposit.performTransaction();
        BankTransaction withdraw = new Withdrawal();
        withdraw.performTransaction();

    }
}
