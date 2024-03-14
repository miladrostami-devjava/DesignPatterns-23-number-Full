package org.example.state2;
/**
 * 2. state 2:  we can initialized this pattern in lazy form
 * */
public class Singleton {
    private static Singleton INSTANCE = null;
    private Singleton(){}

    public static Singleton getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
