package org.example.state4;

import java.io.*;

public class SerializeDemo implements Serializable {


    public static void main(String[] args) {
Singleton singleton1 = Singleton.INSTANCE;
singleton1.setINSTANCE(1);


//Serialize
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("out.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
objectOutputStream.writeObject(singleton1);
objectOutputStream.close();
fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
singleton1.setINSTANCE(2);


        //Deserialize
        Singleton singleton2 ;
        // we can use try with Resources
        try {
            FileInputStream fileInputStream = new FileInputStream("out.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
          singleton2 = (Singleton) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("singletons.SingletonEnum class not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
if (singleton1==singleton2){
    System.out.println("Two objects are same");
}else {
    System.out.println("Two objects are not same");

}
        System.out.println(singleton1.getINSTANCE());
        System.out.println(singleton2.getINSTANCE());

    }


}



