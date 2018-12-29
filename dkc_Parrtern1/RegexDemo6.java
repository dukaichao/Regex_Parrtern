package dkc_Parrtern1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 	正则表达式的获取功能:
 	Pattern和Matcher类的使用
 		jin tian yao xia yu,da jia pa bu pa?huang bu huang? are you sure?
 		获取由三个字符组成的单词
 */
public class RegexDemo6 {
	public static void main(String[] args) {
		String str = "jin tian yao xia yu,da jia pa bu pa?huang bu huang? are you sure?";
		//1.创建Pattern的对象,传入一个正则表达式
		Pattern p = Pattern.compile("\\b[a-zA-Z]{3}\\b");//(\\b单词的边界)
		
		//调用p对象中的matcher 获取匹配器对象
		Matcher matcher = p.matcher(str);
		
		//遍历得结果
		int count = 0;
		while(matcher.find()) {
			System.out.print(matcher.group()+" ");
			count++;
		}
		System.out.println(count);
		// 不能单独使用，必须和found方法配合使用，否则报错:No match found 
		//System.out.println(matcher.group());
	}
}
