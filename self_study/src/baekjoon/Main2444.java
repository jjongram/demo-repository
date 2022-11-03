package baekjoon;

import java.util.Scanner;

public class Main2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i = 2; i <= N; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 2*N-1; j>2*(i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
