package kr.co.demo;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 현재 보유하고 있는 주식의 평단가 80000 원, 보유 주식 수
		 * 10주, 현 주식 가격이 65000 원 일 때 주식 10주를 더 구매
		 * 했을 경우의 총 구매액, 총 보유 주식수, 평단가, 수익률을
		 * 구하여 출력하세요. (수익률은 실수로 출력)
		 * 
		 * 사용자 입력으로 현재 보유 주식의 평단가, 보유 주식 수,
		 * 현 주식 가격, 추가 구매 주식 수를 받아서 풀어보세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유 주식 평단가 : ");
		int average = sc.nextInt();
		
		
		System.out.println("보유 주식 수 : ");
		int have = sc.nextInt();

		
		System.out.println("현 주식 가격 : ");
		int price = sc.nextInt();

		
		System.out.println("추가 구매 주식  : ");
		int add = sc.nextInt();
		
		int allprice = average*have + price*add;
//		System.out.println(allprice);
		int allstocks = have + add;
		int avg = allprice/allstocks;
		double profits = (((double)price/avg)-1)*100;
//		System.out.println(profits);
		
		System.out.println("총 구매액 : " + allprice);
		System.out.println("총 보유 주식 수 : " + allstocks);
		System.out.println("평단가 : " + avg);
		System.out.printf("수익률 : %.2f %%", profits);
		

	}

}
