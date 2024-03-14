package org.example.state5;

public class SingletonWithoutClone implements Cloneable{
    private static SingletonWithoutClone INSTANCE = null;
private SingletonWithoutClone(){

}
    public static SingletonWithoutClone getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonWithoutClone();
        }
        return INSTANCE;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }


}
