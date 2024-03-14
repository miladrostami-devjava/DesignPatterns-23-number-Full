package org.example.state4;

import java.io.Serializable;

/**
 * 2. state 2:  we can initialized this pattern in lazy form
 * */
public class Singleton implements Serializable {
    public static volatile Singleton INSTANCE = new Singleton();
    private Singleton(){}

    protected Object getINSTANCE() {
        return INSTANCE;
    }

    protected Object setINSTANCE(int i){
        return INSTANCE;
 }


}
