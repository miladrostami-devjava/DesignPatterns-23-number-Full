package abstractFactory;

import cryptionInterface.Decryption;
import cryptionInterface.Encryption;
import factory.EncryptionFactory;

public class AESFactory implements EncryptionFactory {
    @Override
    public Encryption createEncryption() {
        return new AESEncryption();
    }

    @Override
    public Decryption createDecryption() {
        return new AESDecryption();
    }
}
