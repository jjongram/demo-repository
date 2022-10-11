package baekjoon;

import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}
