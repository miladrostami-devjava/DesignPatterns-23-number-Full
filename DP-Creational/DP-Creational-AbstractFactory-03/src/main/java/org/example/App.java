package org.example;

import abstractFactory.AESFactory;
import cryptionInterface.Decryption;
import cryptionInterface.Encryption;
import factory.EncryptionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EncryptionFactory factory = new AESFactory();
     Decryption decryption =  factory.createDecryption();
        Encryption encryption = factory.createEncryption();

        System.out.println(encryption.encrypt("milad"));
        System.out.println(decryption.decrypt("jdhjfhj43jhrhjr"));


    }
}
