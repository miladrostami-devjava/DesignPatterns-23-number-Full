package org.example.trx;

import org.example.dp.BankTransaction;

public class Deposit extends BankTransaction {


    @Override
    protected void authenticateUser() {
        System.out.println("authentication user for deposit");

    }

    @Override
    protected void processTransaction() {
        System.out.println("process  transaction user for deposit");

    }

    @Override
    protected void updateAccount() {
        System.out.println("update user for deposit");

    }
}
