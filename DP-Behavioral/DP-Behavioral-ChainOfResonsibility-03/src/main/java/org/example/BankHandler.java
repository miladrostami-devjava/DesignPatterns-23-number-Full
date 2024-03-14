package org.example;

public abstract class BankHandler {

    protected BankHandler successor;

    public void setSuccessor(BankHandler successor) {
        this.successor = successor;
    }

    public static BankHandler runMethod() {
        OneHundredHandler oneHundredHandler = new OneHundredHandler();
        FiftyThousandHandler fiftyThousandHandler = new FiftyThousandHandler();
        TenThousandHandler tenThousandHandler = new TenThousandHandler();
        FiveThousandHandler fiveThousandHandler = new FiveThousandHandler();

        oneHundredHandler.setSuccessor(fiftyThousandHandler);
        fiftyThousandHandler.setSuccessor(tenThousandHandler);
        tenThousandHandler.setSuccessor(fiveThousandHandler);
        return oneHundredHandler;
    }


    public abstract BankAccount withdraw(BankAccount account,Integer amount);

//5000
    //10000
    //20000
    //....


}
