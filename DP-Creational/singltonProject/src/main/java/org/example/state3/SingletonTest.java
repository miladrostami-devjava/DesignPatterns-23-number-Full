package org.example.state3;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getINSTANCE();
        Singleton object2 = Singleton.getINSTANCE();
        Singleton object3 = Singleton.getINSTANCE();
        System.out.println("Hash code object 1 is :" + object1.hashCode());
        System.out.println("Hash code object 2 is :" + object2.hashCode());
        System.out.println("Hash code object 3 is :" + object3.hashCode());

    }


}
