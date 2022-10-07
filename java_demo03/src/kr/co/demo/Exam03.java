package kr.co.demo;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 카카오의 더치페이 기능을 모방하여 다음의 출력 결과가 나오도록 하세요.
		 * 
		 * 출력 형식
		 * 		총 비용 50000 원을 5 명이 더치페이 하여 10000 원씩
		 * 		다음의 계좌로 입금해 주세요.
		 * 		입금 계좌 번호 : 1234-56-123456789
		 * 		나머지 금액 0 원은 제가 부담합니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 비용 : ");
		int spent = sc.nextInt();
		
		System.out.println("인원 수 : ");
		int ppl = sc.nextInt();
		
		int ppp = spent/ppl;
//		System.out.println(ppp);
		
		double rest = spent % ppl;
//		System.out.println(rest);
		
		System.out.println("계좌 번호 : ");
		int banknum = sc.nextInt();

		
		System.out.println("총 비용 " + spent + " 원을 " + ppl + " 명이 더치페이 하여 " + ppp + " 원씩");
		System.out.println("다음의 계좌로 입금해 주세요.");
		System.out.println("입금 계좌 번호 : " + banknum + " ");
		System.out.println("나머지 금액 " + rest + " 원은 제가 부담합니다.");
		/*
		 * String message = " 총 비용 %d 원을
		 */
	}

}
