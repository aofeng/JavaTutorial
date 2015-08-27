package cn.aofeng.demo.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import static cn.aofeng.demo.util.LogUtil.log;;

/**
 * 加密与解密。
 * 
 * @author <a href="mailto:aofengblog@163.com">聂勇</a>
 */
public class EncryptAndDecrypt {

    private final static String CHARSET = "utf8";
    
    private SecretKey createSecretKey(String encryptType, String keyStr)
            throws UnsupportedEncodingException {
        byte[] secretKeyData = keyStr.getBytes(CHARSET);
        SecretKeySpec sks = new SecretKeySpec(secretKeyData, encryptType);
        
        return sks;
    }
    
    private byte[] encrypt(String encryptType, SecretKey secretKey, String srcData)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, UnsupportedEncodingException,
            NoSuchAlgorithmException, NoSuchPaddingException, 
            InvalidAlgorithmParameterException {
        return encrypt(encryptType, secretKey, srcData, null);
    }
    
    private byte[] encrypt(String encryptType, SecretKey secretKey, String srcData, String algorithmParam)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, UnsupportedEncodingException,
            NoSuchAlgorithmException, NoSuchPaddingException, 
            InvalidAlgorithmParameterException {
        Cipher encrpyt = Cipher.getInstance(encryptType);
        if (null == algorithmParam) {
            encrpyt.init(Cipher.ENCRYPT_MODE, secretKey);
        } else {
            IvParameterSpec iv = new IvParameterSpec(algorithmParam.getBytes(CHARSET));
            encrpyt.init(Cipher.ENCRYPT_MODE, secretKey, iv);
        }
        byte[] secretData = encrpyt.doFinal(srcData.getBytes(CHARSET));
        
        return secretData;
    }
    
    private String decrypt(String decryptType, SecretKey secretKey, byte[] secretData)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, UnsupportedEncodingException,
            NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        return decrypt(decryptType, secretKey, secretData, null);
    }
    
    private String decrypt(String decryptType, SecretKey secretKey, byte[] secretData, String algorithmParam)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, UnsupportedEncodingException,
            NoSuchAlgorithmException, NoSuchPaddingException, 
            InvalidAlgorithmParameterException {
        Cipher decrypt = Cipher.getInstance(decryptType);
        if (null == algorithmParam) {
            decrypt.init(Cipher.DECRYPT_MODE, secretKey);
        } else {
            IvParameterSpec iv = new IvParameterSpec(algorithmParam.getBytes(CHARSET));
            decrypt.init(Cipher.DECRYPT_MODE, secretKey, iv);
        }
        byte[] srcData =  decrypt.doFinal(secretData);
        String srcStr = new String(srcData, CHARSET);
        
        return srcStr;
    }
    
    private void blowfishPerformence(String data)
            throws UnsupportedEncodingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException,
            NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        SecretKey secretKey;
        String type = "Blowfish";
        secretKey = createSecretKey(type, "abcdefgh_1234567");
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            encrypt(type, secretKey, data+j);
        }
        long endTime = System.currentTimeMillis();
        long usedTime = endTime - startTime;
        log("使用%s进行%d次加密消耗时间%d毫秒", type, 100000, usedTime);
    }
    
    private void aesPerformence(String data)
            throws UnsupportedEncodingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException,
            NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        SecretKey secretKey;
        String type = "AES/CBC/PKCS5Padding";
        secretKey = createSecretKey("AES", "abcdefgh_1234567");
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            encrypt(type, secretKey, data+j, "abcdefgh12345678");
        }
        long endTime = System.currentTimeMillis();
        long usedTime = endTime - startTime;
        log("使用%s进行%d次加密消耗时间%d毫秒", type, 100000, usedTime);
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException, 
            NoSuchPaddingException, UnsupportedEncodingException,
            InvalidKeyException, IllegalBlockSizeException, 
            BadPaddingException, InvalidAlgorithmParameterException {
        String data = "炎黄，汉字，english,do it,abcdefghijklmnopqrstuvwxyz,0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ, ~!@#$%^&*()_+=-";
        log("待加密的数据：\n%s", data);
        
        String encryptType = "Blowfish";
        EncryptAndDecrypt bf = new EncryptAndDecrypt();
        SecretKey secretKey = bf.createSecretKey(encryptType, "abcdefgh_1234567");
        byte[] secretData = bf.encrypt(encryptType, secretKey, data);
        log("使用%s加密后的数据：", encryptType);
        log(Base64.encodeBase64String(secretData));
        
        String srcStr = bf.decrypt(encryptType, secretKey, secretData);
        log("解密后的数据：\n%s", srcStr);
        
        // ==========性能测试==========
        // AES
        bf.aesPerformence(data);
        
        // Blowfish
        bf.blowfishPerformence(data);
    }

}
