package java_demo04;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로부터 키(m)와
		 * 체중(kg) 값을 입력 받아 BMI 를 구하여 결과값을 출력
		 * 할 때 25 이상의 결과인 경우 "비만입니다." 라는 메시지
		 * 가 출력 되도록 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m) 입력 : ");
		double tall = sc.nextDouble();
		
		System.out.println(tall);
		
		System.out.println("몸무게(kg) 입력 : ");
		double weight = sc.nextDouble();
		
		double bmi = (double)weight/Math.pow(tall, 2);
		
		if(bmi>=25) {
			System.out.println("비만입니다");
		} else {
			System.out.printf("당신의 BMI 지수 값은 %.2f 입니다.", bmi);
		}
		
//		System.out.printf("당신의 BMI 지수 값은 %.2f 입니다.", bmi);

	}

}
