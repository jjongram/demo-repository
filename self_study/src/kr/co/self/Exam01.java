package kr.co.self;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 년도 값을 입력 받아 해당 년도가 윤년인지 아닌지 구하세요.
		 * (윤년은 4의 배수이면 윤년이 됩니다. 또한 4의 배수이면서 100의 배수이면 윤년이 아닙니다.
		 * 또한 4, 100, 400 의 배수에 해당하면 윤년 입니다.)
		 * 
		 * 예시
		 * 년도 : 2022
		 * 윤년이 아닙니다
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		int year = sc.nextInt();
		
		System.out.println(year);
		if((year % 4 != 0) || ((year % 4 == 0) && (year % 100 == 0)) || ((year % 4 != 0) && (year % 100 != 0) && (year % 400 != 0))) {
//		if(((year % 4 != 0) && (year % 100 != 0))){

			System.out.println("년도 : " + year);
			System.out.println("윤년이 아닙니다.");
		} else {
			System.out.println("윤년입니다.");
		}
/*
 * 		if(year % 4 == 0) {
 * 			if
 */
	}

}
