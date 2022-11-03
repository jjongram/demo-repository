package baekjoon;

import java.util.Scanner;

public class Main8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
//		System.out.println(n*(n+1)/2);
		for(int i = 1; i <= n; i++) {
			s+=i;
		}
		System.out.println(s);
	}
}
