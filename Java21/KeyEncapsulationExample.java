package Java21;

import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyEncapsulationExample {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        // Encapsulate the secret key with the public key
        byte[] encapsulatedKey = encapsulate(secretKey.getEncoded(), keyPair.getPublic());

        // Decapsulate the secret key with the private key
        byte[] decapsulatedKey = decapsulate(encapsulatedKey, privateKey);

        System.out.println("Secret Key encapsulated and decapsulated successfully.");
    }
    // Method to encapsulate the secret key
    public static byte[] encapsulate(byte[] secretKey, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(secretKey);
    }

    // Method to decapsulate the secret key
    public static byte[] decapsulate(byte[] encapsulatedKey, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(encapsulatedKey);
    }
}