package org.example.state5;

public class CloningSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonCloneable singletonCloneable1 =
             SingletonCloneable.getINSTANCE();

        SingletonCloneable singletonCloneable2 =
                (SingletonCloneable) singletonCloneable1.clone();
        SingletonCloneable singletonCloneable3 =
                (SingletonCloneable) singletonCloneable2.clone();

        System.out.println("hashCode of instance 1 - " + singletonCloneable1.hashCode());
        System.out.println("hashCode of instance 2 - " + singletonCloneable2.hashCode());
        System.out.println("hashCode of instance 3 - " + singletonCloneable3.hashCode());

    }

}
