package org.example;

public class OneHundredHandler extends BankHandler {

    /**
     * for 100_000 $
     * */
    @Override
    public BankAccount withdraw(BankAccount account, Integer amount) {
        /*
        example:::
        * 485000 =
        *  4*100_000 +
        * 1*50_000 +
        * 3*10_000 +
        * 1* 5000
        *
        * */


        int numberOfMoneyToIssued = amount / 100_000;
        if (numberOfMoneyToIssued > 0){
            System.out.println(numberOfMoneyToIssued  + " >= 100_000");
        }
        int pendingAmount  = amount % 100_000;
        if (pendingAmount > 0){
            if (successor == null){
                System.out.println("Invalid Amount!");
                return account;
            }
            successor.withdraw(account,pendingAmount);
        }
        return account;
    }
}
