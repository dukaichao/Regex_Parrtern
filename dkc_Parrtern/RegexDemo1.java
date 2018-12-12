package dkc_Parrtern;

import java.util.Scanner;
//正则表达式
/*
 	字符类
	 	[abc]   表示只有abc其中一个
	 	[^abc]	任何字符除了a,b,c
	 	[a-zA-Z]a到z,A-Z,两头字母包含
 	预定义字符类
 		.		任何字符
 		\d 		数字[0-9]
 		\D		非数字[^0-9]
 		\s		空白字符:[\t\n\x0B\f\r]
 		\S		非空白字符:[^s]  一个
 		\w		单词字符:[a-zA-Z_0-9]   一个字符
 		\W		非单词字符:[^\\w]
 	Greedy 数量词
 		X?		X,一次或一次也没有
 		X*		X,零次或多次
 		X+		X,一次或多次
 	X+		X,一次或多次
 	X*		X,零次或多次
 	X{n}	X,恰好n次
 	X{n,}	X,至少n次
 	X{n,m}	X,至少n次，但是不超过m次
 	
 */
/*校验QQ号码:
	1.长度5-15
	2.组成0-9，不能以0开头*/
public class RegexDemo1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入QQ号:>");
		String str = s.nextLine();
		if(checkQQ1(str)) {
			System.out.println("nice ,is very good！");
		}else {
			System.out.println("lowb");
		}
	}
	
	public static boolean checkQQ(String str) {
		if(str.length()<5||str.length()>15)
			return false;
		if(!str.startsWith("0")) {
			for(int i = 0;i<str.length();i++) {
				if(!Character.isDigit(str.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static boolean checkQQ1(String str) {
		//					开头   	开头以后     	长度             里面的长度是按数组下标的形式
		return str.matches("[1-9]\\d{4,14}");//匹配功能
		//return str.matches("\\S");
	}
}
