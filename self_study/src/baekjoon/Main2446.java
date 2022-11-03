package baekjoon;

import java.util.Scanner;

public class Main2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1 ; i <= N; i++) {
			for(int j = 2; j <= i ; j++) {
				System.out.print(" ");
			}
			for(int j = 2*N-1; j>2*(i-1); j--) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i = 1; i <= N-1; i++) {
			for(int j = N-1; j >= i+1; j--) {
				System.out.print(" ");
			}
			for(int j = 2; j <= (i+1)*2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
