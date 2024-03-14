package abstractFactory;

import cryptionInterface.Encryption;

public class AESEncryption implements Encryption {


    @Override
    public String encrypt(String paintText) {
        return "AES hash" + " " + paintText;

    }


}
