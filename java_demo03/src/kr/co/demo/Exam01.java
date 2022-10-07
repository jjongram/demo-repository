package kr.co.demo;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 다음의 문제를 풀어보세요.
		 * 
		 * 사용자 입력으로 키(m) , 몸무게(kg) 를 tall, weight 변수에
		 * 저장하여 BMI 지수를 구하고 출력하세요.
		 * 
		 * BMI 지수는 몸무게 (kg) / 키(m)^2 으로 구합니다.
		 * 
		 * 출력 형식
		 * 		당신의 BMI 지수 값은 23.52 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m) 입력 : ");
		double tall = sc.nextDouble();
		
		System.out.println(tall);
		
		System.out.println("몸무게(kg) 입력 : ");
		double weight = sc.nextDouble();
		
//		bmi = weight / (tall * tall);
		
//		double bmi = (double)weight/(tall*tall)
//		System.out.println(bmi);
//		System.out.println("당신의 BMI 지수 값은 " +  + "입니다"));
//		
		double bmi = (double)weight/Math.pow(tall, 2);
//		System.out.println("당신의 BMI 지수 값은 " + bmi + " 입니다.");
		System.out.printf("당신의 BMI 지수 값은 %.2f 입니다.", bmi);
	}

}
