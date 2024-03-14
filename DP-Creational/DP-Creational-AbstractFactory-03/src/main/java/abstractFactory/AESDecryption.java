package abstractFactory;

import cryptionInterface.Decryption;

public class AESDecryption implements Decryption {


    @Override
    public String decrypt(String hash) {
        return "AES Plain Text" + " " + hash;
    }
}
