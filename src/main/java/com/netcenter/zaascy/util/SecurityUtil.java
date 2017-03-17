package com.netcenter.zaascy.util;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SecurityUtil {

    public static final String Algorithm = "DES/CBC/PKCS5Padding";
    public static final byte[] bytes = {'e', '+', 's', 'u', '%', '*', '4', 'O'};
    public static final byte[] key = {'d', 'e', '#', '$', '%', '^', '7', 'l'};
    //new String("de$%^@#-").getBytes();
    public static SecretKey deskey = new SecretKeySpec(key, "DES");
    public static IvParameterSpec ivSpec = new IvParameterSpec(bytes);

    private SecurityUtil() {
    }

    public static String encryptMessage(String s) throws Exception {
        if (s == null) return null;
        //加密
        Cipher c1 = Cipher.getInstance(Algorithm);
        c1.init(Cipher.ENCRYPT_MODE, deskey, ivSpec);
        byte[] cipherByte = c1.doFinal(s.getBytes());
        BASE64Encoder base64encoder = new BASE64Encoder();
        return base64encoder.encode(cipherByte);
    }

    public static String decryptMessage(String s) throws Exception {
        if (s == null) return null;
        //解密
        BASE64Decoder base64decoder = new BASE64Decoder();
        byte cipherByte[] = base64decoder.decodeBuffer(s);
        Cipher c1 = Cipher.getInstance(Algorithm);
        c1.init(Cipher.DECRYPT_MODE, deskey, ivSpec);
        byte[] clearByte = c1.doFinal(cipherByte);
        String rs = new String(clearByte);
        return rs;
    }


    public static void main(String[] args) {
        try {
            String pwd = SecurityUtil.encryptMessage("11111111");
            System.out.println(pwd);
            String rs = SecurityUtil.decryptMessage("gdKEiQ5s2Plpu89cBJnz7Q==");//oou16do5

            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
