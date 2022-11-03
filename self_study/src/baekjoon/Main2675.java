package baekjoon;

import java.util.Scanner;

public class Main2675 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			
			for(int k = 0; k < str.length(); k++) {
				for(int j = 1; j <= n; j++) {
				System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
	}

}
