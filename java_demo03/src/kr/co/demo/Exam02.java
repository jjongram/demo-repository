package kr.co.demo;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 시, 분, 초 를 hour, minute, second 변수에
		 * 저장하고 초로 환산된 결과를 출력하세요.
		 * 
		 * 예시
		 * 		시 : 0
		 * 		분 : 10
		 * 		초 : 20
		 * 
		 * 		총 620 초 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시 입력 : ");
		int hour = sc.nextInt();
		
		System.out.println("분 입력 : ");
		int minute = sc.nextInt();

		System.out.println("초 입력 : ");
		int second = sc.nextInt();
		
		int sum = 3600*(int)hour + 60*(int)minute + (int)second;

		System.out.println("총 " + sum + " 초 입니다.");
		

	}

}
