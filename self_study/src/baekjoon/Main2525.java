package baekjoon;

import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		System.out.println("dd");
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");
		
		int A = Integer.valueOf(input[0]);
		int B = Integer.valueOf(input[1]);
		
		
		int C = Integer.valueOf(sc.nextLine());
		
		A += (B + C) / 60;
		if(A>=24) {
			A %= 24;
		}
		B = (B + C) % 60;
		System.out.printf("%d %d", A, B);

	}

}
//		
//		if (B + C >= 60) {
//			B = (B + C)%60;
//			A = A + (B + C)/60;
//		} else {
//			B = (B + C);
//			A = A + (B + C)/60;
//		}
//		
