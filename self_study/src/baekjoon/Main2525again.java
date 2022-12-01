package baekjoon;

import java.util.Scanner;

public class Main2525again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");
		
		int A = Integer.valueOf(input[0]);
		int B = Integer.valueOf(input[1]);
		
		
		int C = Integer.valueOf(sc.nextLine());
		
		A = A * 3600;
		B = B * 60;
		C = C * 60;
		
		A = (A + B + C)/3600;
		if(A >= 24) {
			A %= 24;
		}
		B = ((B + C)/60)%60;
		System.out.printf("%d %d", A, B);
	}

}
