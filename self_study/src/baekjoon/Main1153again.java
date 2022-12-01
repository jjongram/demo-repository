package baekjoon;

import java.util.Scanner;

public class Main1153again {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		sc.nextLine();
		str = str.trim();
		String strarr[] = str.split(" ");
		if(strarr.equals(null)) {
			System.out.println("0");
		} else {
			System.out.print(strarr.length); 
		}
	}
}
