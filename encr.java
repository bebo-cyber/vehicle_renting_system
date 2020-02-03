import java.lang.*;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
public class encr{
public static String encrypt(String strClearText,String strKey) throws Exception{
	String strData="";
	
	try {
		SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
		byte[] encrypted=cipher.doFinal(strClearText.getBytes());
		strData=new String(encrypted);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception(e);
	}
	return strData;

}
public static void main(String[] args) throws Exception{
    String str=encrypt("varsha", "neha");
	System.out.println(str);
}
}
