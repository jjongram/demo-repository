package baekjoon;

import java.util.Scanner;

public class Baekjoon2438 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력.");
		int n = sc.nextInt();
		
		for(int i=1 ; i <= n; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
