package baekjoon;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int n = sc.nextInt();
		String str = sc.next();
		for(int i = 0; i < n; i++) {
		s += ((int)str.charAt(i)-48);
		}
		System.out.println(s);
	}
}
