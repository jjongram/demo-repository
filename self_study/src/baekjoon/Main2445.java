package baekjoon;

import java.util.Scanner;

public class Main2445 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1 ; i <= N; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			for(int j = 2*N; j>2*(i); j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}


			System.out.println();
		}
		for(int i = 2; i <= N; i++) {
			for(int j = N; j >= i; j--) {
				System.out.print("*");
			}
			for(int j = 1; j <= (i-1)*2; j++) {
				System.out.print(" ");
			}
			for(int j = N; j >= i; j--) {
				System.out.print("*");
			}

			
			System.out.println();
		}


	}

}
