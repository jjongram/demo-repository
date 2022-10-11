package java_demo04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로부터 정수값을
		 * 입력 받았을 때, 5의 배수 값만 출력하게 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("정수값을 입력해주세요.");
		num = sc.nextInt();
		
		if(num%5 == 0) {
			System.out.println(num);
		}

		
	}

}
