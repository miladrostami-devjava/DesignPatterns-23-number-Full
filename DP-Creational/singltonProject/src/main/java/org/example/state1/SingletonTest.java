package org.example.state1;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getINSTANCE();
        Singleton object2 = Singleton.getINSTANCE();
        System.out.println("Hash code object 1 is :" + object1.hashCode());
        System.out.println("Hash code object 2 is :" + object2.hashCode());


    }


}
