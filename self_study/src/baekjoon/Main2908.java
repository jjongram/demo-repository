package baekjoon;

import java.util.Scanner;

public class Main2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		String str1 = input[0];
		String str2 = input[1];

		char[] s1 = new char[str1.length()];
		char[] s2 = new char[str2.length()];
		
		for(int i = str1.length(); i > 0; i--) {
			s1[str1.length()-i] = str1.charAt(i-1);
		}
		String str3 = String.valueOf(s1);
		
		for(int i = str2.length(); i > 0; i--) {
			s2[str2.length()-i] = str2.charAt(i-1);
		}
		String str4 = String.valueOf(s2);
		
		if(Integer.parseInt(str3) > Integer.parseInt(str4)) {
			System.out.println(str3);
		} else if(Integer.parseInt(str4) > Integer.parseInt(str3)) {
			System.out.println(str4);
		}
	}

}
