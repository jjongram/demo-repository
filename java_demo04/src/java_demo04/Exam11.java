package java_demo04;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 사용자가 입력한 2 개의 정수값
		 * n, m 을 n ~ m 까지의 반복 또는 m ~ n 까지의 반복
		 * 을 수행하는 코드를 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(; n < m; n++) {
			System.out.println(n);		
		}
		for(; m < n; m++) {
			System.out.println(m);

		}

	}

}
