package cn.aofeng.demo.encrypt;

import static cn.aofeng.demo.util.LogUtil.log;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import org.apache.commons.codec.binary.Base64;

/**
 * AES加密与解密。
 * 
 * @author <a href="mailto:aofengblog@163.com">聂勇</a>
 */
public class AES extends EncryptAndDecrypt {

    public static void main(String[] args) throws UnsupportedEncodingException,
            InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        String data = "炎黄，汉字，english,do it,abcdefghijklmnopqrstuvwxyz,0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ, ~!@#$%^&*()_+=-";
        log("待加密的数据：\n%s", data);

        AES aes = new AES();
        String encryptType = "AES/CBC/PKCS5Padding";
        String algorithmParam = "abcdefgh12345678";
        SecretKey secretKey = aes.createSecretKey("AES", "abcdefgh_1234567");
        byte[] secretData = aes.encrypt(encryptType, secretKey, data, algorithmParam);
        log("使用%s加密后的数据：", encryptType);
        log(Base64.encodeBase64String(secretData));

        String srcStr = aes.decrypt(encryptType, secretKey, secretData, algorithmParam);
        log("解密后的数据：\n%s", srcStr);
    }

}
