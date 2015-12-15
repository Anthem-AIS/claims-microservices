package com.anthem.ais.pmb.claims.microservices.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author P Dindy Created: 5/30/2014
 */
public class AESEncryption {

	// Add your keys here. Must be 16 bytes.
	private static String CII1_KEY = "xxx";
	private static String CII2_KEY = "ja*uM$%zfW`ZBwl^";
	private static String TRANSFORMATION = "AES/CBC/PKCS5Padding";
	private static String ALGORITHM_AES = "AES";
	private static String CHARACTERSET = "UTF-8";

	private static AESEncryption instance;

	private Cipher cipher = null;

	private AESEncryption() throws InvalidKeyException,
			UnsupportedEncodingException, NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchProviderException,
			NoSuchPaddingException {
	}

	public static AESEncryption getInstance() throws InvalidKeyException,
			UnsupportedEncodingException, NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchProviderException,
			NoSuchPaddingException {
		if (instance == null) {
			instance = new AESEncryption();
		}
		return instance;
	}

	/*
	 * encrypt Encrypts text using AES encryption algorithm Pass the text to be
	 * encrypted, and the AES Key. Returns the encrypted text.
	 */
	public String encrypt(String plainText, String encryptionKey)
			throws UnsupportedEncodingException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			javax.crypto.BadPaddingException {

		BASE64Encoder encoder = new BASE64Encoder();
		String base64Text = null;
		SecretKeySpec key = null;
		byte[] iv = null;
		byte[] keyBytes = null;
		byte[] encryptedBytes = null;

		keyBytes = encryptionKey.getBytes(CHARACTERSET);

		key = new SecretKeySpec(keyBytes, ALGORITHM_AES);
		cipher = Cipher.getInstance(TRANSFORMATION);
		iv = new byte[cipher.getBlockSize()];
		cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
		encryptedBytes = cipher.doFinal(plainText.getBytes(CHARACTERSET));

		base64Text = encoder.encode(encryptedBytes);
		return base64Text;
	}

	/*
	 * Decrypt AES text Just pass the encrypted text and key Returns the
	 * unencrypted text.
	 */
	public String decrypt(String cipherText, String encryptionKey)
			throws UnsupportedEncodingException, NoSuchPaddingException,
			NoSuchAlgorithmException, InvalidKeyException,
			InvalidAlgorithmParameterException, IOException,
			javax.crypto.BadPaddingException, IllegalBlockSizeException {

		BASE64Decoder decoder = new BASE64Decoder();
		SecretKeySpec key = null;
		byte[] keyBytes = null;
		byte[] iv = null;
		byte[] cipherBytes = null;
		byte[] decryptedText = null;

		keyBytes = encryptionKey.getBytes(CHARACTERSET);
		key = new SecretKeySpec(keyBytes, ALGORITHM_AES);
		cipher = Cipher.getInstance(TRANSFORMATION);
		iv = new byte[cipher.getBlockSize()];
		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));

		cipherBytes = decoder.decodeBuffer(cipherText);
		decryptedText = cipher.doFinal(cipherBytes);

		return new String(decryptedText);
	}

	/*
	 * Convenience method for encrypting for CII2
	 */
	public String encryptForCII2(String plainText) throws Exception {
		return encrypt(plainText, CII2_KEY);
	}

	/*
	 * Convenience method for decryption for CII2
	 */
	public String decryptForCII2(String cipherText) throws Exception {
		return decrypt(cipherText, CII2_KEY);
	}

	/*
	 * This will generate a 128 bit encryption key for you You can pass 128, 192
	 * or 256
	 */
	public byte[] generateKey(int bitLength) throws NoSuchAlgorithmException {
		KeyGenerator gen = KeyGenerator.getInstance(ALGORITHM_AES);
		gen.init(bitLength);
		SecretKey k = gen.generateKey();

		String genKey = new String(k.getEncoded());

		return k.getEncoded();
	}

	public byte[] generate128BitKey() throws NoSuchAlgorithmException {
		return generateKey(128);
	}
}
