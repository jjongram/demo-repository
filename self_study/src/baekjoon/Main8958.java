package baekjoon;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 0; i < n; i++) {
			int score = 0;
			String str = sc.nextLine();
			for(int j = 0; j < str.length(); j++) {
				int o = 0;
				if(str.charAt(j)=='O') {
					o++;
					score += o;
				}
			}
			System.out.println(score);
//		}
	}

}
