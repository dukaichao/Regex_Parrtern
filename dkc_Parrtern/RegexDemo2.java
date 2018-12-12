package dkc_Parrtern;

import java.util.Scanner;

public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*System.out.println("请输入手机号码:>");
		while(true) {
			String str = s.nextLine();
			if(check_Phone(str)) {
				System.out.println("is very good");
				break;
			}
			System.out.println("不正确,请重新输入:>");
		}*/
		
		/*System.out.println("请输入邮箱地址:>");
		while(true) {
			String str = s.nextLine();
			if(check_Email(str)) {
				System.out.println("is very good");
				break;
			}
			System.out.println("不正确,请重新输入:>");
		}*/
		
		System.out.println("请输入身份证号:>");
		while(true) {
			String str = s.nextLine();
			if(check_IDcard(str)) {
				System.out.println("is very good");
				break;
			}
			System.out.println("不正确,请重新输入:>");
		}
	}
	
	//验证电话
	public static boolean check_Phone(String str) {
		return str.matches("1[345678]\\d{9}");
	}
	
	//验证邮箱
	public static boolean check_Email(String str) {
		return str.matches("\\w{3,20}@\\w{2,9}(\\.[a-zA-Z]{1,5}){1,2}");
	}
	
	//验证身份证
	public static boolean check_IDcard(String str) {
		return str.matches("[1-9]\\d{5}(19\\d{2}|20\\d{2})((0[1-9])|(10|11|12))(([0-2][1-9])|10|30|31)\\d{3}[0-9Xx]{1}");
	}
}
