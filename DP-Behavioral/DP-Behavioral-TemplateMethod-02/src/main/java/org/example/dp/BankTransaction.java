package org.example.dp;

public abstract class BankTransaction {

    protected abstract void authenticateUser();
protected abstract void processTransaction();
protected abstract void updateAccount();

public final void  performTransaction(){
    authenticateUser();
    processTransaction();
    updateAccount();

}

}
