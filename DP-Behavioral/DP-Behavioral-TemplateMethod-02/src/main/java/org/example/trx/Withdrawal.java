package org.example.trx;

import org.example.dp.BankTransaction;


public class Withdrawal extends BankTransaction {


    @Override
    protected void authenticateUser() {
        System.out.println("authentication user for withdraw");
    }

    @Override
    protected void processTransaction() {
        System.out.println("process transaction user for withdraw");

    }

    @Override
    protected void updateAccount() {
        System.out.println("update user for withdraw");

    }
}
