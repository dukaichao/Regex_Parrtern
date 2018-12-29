package dkc_Parrtern1;

import java.util.ArrayList;
import java.util.List;

/*
 	正则表达式的替换功能: String: replaceAll
 */
public class RegexDemo5 {
	public static void main(String[] args) {
		String phone = "18329571234";
		String str = phone.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$2****$2");
		System.out.println(str);
		
		//将敏感字换成*
		String s = "王二狗，王八蛋，你好！";       //将王八蛋替换成*
		//将字符串中出现王八蛋三个字都变成*
		String r = s.replaceAll("[(王八蛋)]", "*");   
		System.out.println(r);
		
		
	}
}
