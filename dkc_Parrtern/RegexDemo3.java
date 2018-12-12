package dkc_Parrtern;

import java.util.Arrays;

/*
  	split	字符分割
  	ii,jj,kk
  	ii.jj.kk
  	ii jj kk
  	路径名分割
 
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		String str1 = "ii,jj,kk";
		String[] s1 = str1.split(",");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		String str2 = "ii.jj.kk";
		String[] s2 = str2.split("\\.");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		
		String str3 = "ii jj kk";
		String[] s3 = str3.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		String str4 = "F:\\Gitproject\\Dec_12\\dkc_Parrtern";
		String[] s4 = str4.split("\\\\");
		System.out.println(s4[0]);
		System.out.println(s4[1]);
		System.out.println(s4[2]);
		System.out.println(s4[3]);

		String str5 = "F:/Gitproject/Dec_12/dkc_Parrtern";
		String[] s5 = str5.split("/");
		System.out.println(s5[0]);
		System.out.println(s5[1]);
		System.out.println(s5[2]);
		System.out.println(s5[3]);
		String str ="i	j	k";
		String[] s = str.split("\\s");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		
	}
}
