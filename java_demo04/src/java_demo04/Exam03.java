package java_demo04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로 부터 정수값
		 * 2개를 입력 받았을 때 정수값 0이 있는 경우 나누기 계산
		 * 에서 0 으로 나누었을 때 발생하는 오류가 나지 않게
		 * 처리하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 2개 입력해주세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
//		System.out.println(num1);
//		System.out.println(num2);
		if(x == 0 || y ==0) {
			System.out.println("0을 입력하지 마시오.");
		} else {
			System.out.println(x);
			System.out.println(y);
		}
		

	}

}
