package factory;

import cryptionInterface.Decryption;
import cryptionInterface.Encryption;

public interface EncryptionFactory {
    Encryption createEncryption();
    Decryption createDecryption();


}
