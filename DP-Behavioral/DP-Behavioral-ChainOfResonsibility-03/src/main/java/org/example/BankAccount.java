package org.example;

public class BankAccount {
    private final Integer accountNumber;
    private final Integer balance;

    public BankAccount(Integer accountNumber, Integer balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }
}
