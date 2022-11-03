package baekjoon;

import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {
		System.out.println("dd");
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");
		
		int H = Integer.valueOf(input[0]);
		int M = Integer.valueOf(input[1]);
		
		M += 15;
		H += 23;
		if(M >= 60) {
			M %= 60;
			++H;
		}
		H %= 24;
		
//		H = M >= 60 ? (H + 1) % 24 : H;
//		M = M >= 60 ? M % 60 : M;
//			
		System.out.printf("%d %d", H, M);
	}

}
