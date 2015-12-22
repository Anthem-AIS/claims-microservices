package com.anthem.ais.pmb.claims.microservices.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class Encryption
{
//    static String secret = "<<Encryption Key>>";
//    static String IVstring = "<<IV String>>";
    static String secret = "Sn43R28*893bnheDJf79L43_";
    static String IVstring = "72&r_SwC";
    static char [] passphrase = { 'd', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n', 'a', 't', 'e', 'd' };

    static String DESEDEALG = "DESede/CBC/PKCS5Padding";
    static String AESEDEALG = "AES/CBC/PKCS5Padding";

    IvParameterSpec paramspec, aesparamspec;
    SecretKey desedekey,aeskey, tmpsk;

    private static Encryption instance;

    private Encryption() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeySpecException
    {
        DESedeKeySpec desedekeyspec = new DESedeKeySpec(secret.getBytes("UTF8"));
        SecretKeyFactory desedefactory = SecretKeyFactory.getInstance("DESede");
        desedekey = desedefactory.generateSecret(desedekeyspec);
        paramspec = new IvParameterSpec(IVstring.getBytes("UTF8"));

        SecretKeyFactory aesfactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        KeySpec spec = new PBEKeySpec(passphrase, secret.getBytes("UTF8"), 1000, 256);
        //KeySpec spec = new PBEKeySpec(passphrase, secret.getBytes("UTF8"), 65536, 256);
        tmpsk = aesfactory.generateSecret(spec);
        aeskey = new SecretKeySpec(tmpsk.getEncoded(), "AES");
        aesparamspec = new IvParameterSpec(IVstring.getBytes("UTF-16LE"));
    }

    public static Encryption getInstance() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException,
            InvalidKeySpecException
    {
        if (instance == null)
        {
            instance = new Encryption();
        }
        return instance;
    }

    public String encrypt(String text, String algorithm) throws UnsupportedEncodingException, NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException
    {
        byte[] plainText = text.getBytes("UTF8");

        Cipher cipher = null;

        if (algorithm.toLowerCase().equals("desede"))
        {
            cipher = Cipher.getInstance(DESEDEALG);
            cipher.init(Cipher.ENCRYPT_MODE, desedekey, paramspec);

        }
        else if (algorithm.toLowerCase().equals("aes"))
        {
            cipher = Cipher.getInstance(AESEDEALG);
            cipher.init(Cipher.ENCRYPT_MODE, aeskey,aesparamspec);
        }
        byte[] cipherText = cipher.doFinal(plainText);

        BASE64Encoder encoder = new BASE64Encoder();
        String base64Text = encoder.encode(cipherText);
        return base64Text;

    }

    public String decrypt(String text, String algorithm) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, IOException
    {
        BASE64Decoder base64decoder = new BASE64Decoder();
        byte[] encryptedText = base64decoder.decodeBuffer(text);

        Cipher cipher = null;

        if (algorithm.toLowerCase().equals("desede"))
        {
            cipher = Cipher.getInstance(DESEDEALG);
            cipher.init(Cipher.DECRYPT_MODE, desedekey, paramspec);
        }
        else if (algorithm.toLowerCase().equals("aes"))
        {
            cipher = Cipher.getInstance(AESEDEALG);
            cipher.init(Cipher.DECRYPT_MODE, aeskey,aesparamspec);
        }
        byte[] cipherText = cipher.doFinal(encryptedText);

        return (new String(cipherText));
    }

}

