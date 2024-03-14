package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankHandler bankHandler = BankHandler.runMethod();
        BankAccount miladAccount = new BankAccount(125488685,15_000);

        bankHandler.withdraw(miladAccount,60_250);




    }


}
