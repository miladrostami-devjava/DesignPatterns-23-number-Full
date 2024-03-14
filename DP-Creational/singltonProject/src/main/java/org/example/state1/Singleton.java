package org.example.state1;
/**
 * 1. state 1:  Singleton With Public Static Final Field
 * */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }
}
