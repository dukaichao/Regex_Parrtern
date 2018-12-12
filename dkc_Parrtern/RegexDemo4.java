package dkc_Parrtern;

import java.util.Arrays;

/*
 	input:"5 35 53 2 3"
 	output:"2 3 5 35 53"
 */
public class RegexDemo4 {
	public static void main(String[] args) {
		String str = "5 35 53 2 3";
		System.out.println(stringSort(str));
	}
	
	public static String stringSort(String str) {
		String[] s = str.split(" ");
		int[] arr = new int[s.length];
		for(int i = 0;i<s.length;i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<arr.length;i++) {
			sb.append(arr[i]).append(" ");
		}
		
		return sb.toString();
	}
}
