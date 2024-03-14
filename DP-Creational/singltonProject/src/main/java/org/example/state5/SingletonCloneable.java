package org.example.state5;

public class SingletonCloneable implements Cloneable {
private static SingletonCloneable INSTANCE = null;
private SingletonCloneable(){

}

    public static SingletonCloneable getINSTANCE() {
    if (INSTANCE == null){
        INSTANCE = new SingletonCloneable();
    }

        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
       return super.clone();
    }
}
