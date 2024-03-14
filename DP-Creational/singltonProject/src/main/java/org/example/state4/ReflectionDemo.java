package org.example.state4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;

        try {
            Constructor constructor = singleton1.getClass().getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
        Singleton singleton2 = (Singleton) constructor.newInstance();

        if (singleton1 == singleton2){
            System.out.println("Two objects are same");

        }else {
            System.out.println("Two objects are not same");

        }
        singleton1.setINSTANCE(1);
        singleton2.setINSTANCE(2);

            System.out.println(singleton1.getINSTANCE());
            System.out.println(singleton2.getINSTANCE());



        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }


}
