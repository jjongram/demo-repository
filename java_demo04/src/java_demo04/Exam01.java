package java_demo04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 정수값을 
		 * 입력 받았을 때, 1 ~ 45 사이의 값만 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 입력해주세요.");
		int num = sc.nextInt();
		
		if(1 <= num && num <= 45) {
			System.out.println(num);
		}

		
	}

}
