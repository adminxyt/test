package test;
import org.springframework.util.DigestUtils;

public class Md5 {
	public static String md5(String p){
		return  new String(DigestUtils.md5DigestAsHex(p.getBytes()));
	}
public static void main(String[] args) {
	String a=md5("123456");
	System.out.println(a);
	
}
}
