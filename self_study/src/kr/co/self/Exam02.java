package kr.co.self;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 2022 년 10월 달력을 참고하여 사용자가 입력한 일자가 무슨 요일인지 출력하세요.
		 * 예시
		 * 일자 : 10
		 * 월요일 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요.");
		int date = sc.nextInt();
		
//		System.out.println(date);
		if(date % 7 == 3) {
			System.out.println("월요일 입니다.");
		} else if (date % 7 == 4) {
			System.out.println("화요일 입니다.");
		} else if (date % 7 == 5) {
			System.out.println("수요일 입니다.");
		} else if (date % 7 == 6) {
			System.out.println("목요일 입니다.");
		} else if (date % 7 == 0) {
			System.out.println("금요일 입니다.");
		} else if (date % 7 == 1) {
			System.out.println("토요일 입니다.");
		} else if (date % 7 == 2) {
			System.out.println("일요일 입니다.");
		}

		
	}

}
