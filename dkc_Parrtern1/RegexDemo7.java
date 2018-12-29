package dkc_Parrtern1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 	正则表达式的获取
 		配合IO流，从一个文本读取文件，获取文件里面单词的个数
 */
public class RegexDemo7 {
	public static void main(String[] args) {
		//在E盘的word.txt中随便写入几行汉字加单词
		/*大家好！hello everybody，我来自寒寨，
		My name is duxiansen,I come from HanZhai.哈哈*/
		File file = new File("E:\\word.txt");
		//1.读取文件声明BufferedReader对象br
		BufferedReader br = null;
		//2.创建Pattern的对象,传入一个正则表达式
		Pattern p = null;
		//3.调用p对象中的matcher 获取匹配器对象
		Matcher matcher = null;
		//4.定义计算器
		int count = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String str ="";
			while((str = br.readLine()) != null) {
				p = Pattern.compile("\\b[a-zA-Z]+\\b");
				matcher = p.matcher(str);
				while(matcher.find()) {
					count++;
				}
			}
			System.out.println(count);
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
