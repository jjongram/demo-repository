package java_demo04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 
		 */
		Scanner sc = new Scanner(System.in);
	
		System.out.println("월 입력.");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("시작 요일 입력.");
		String b = sc.nextLine();
		System.out.println("마지막 일자 입력.");
		int c = sc.nextInt();
		
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int i;
		
		switch(b) {
			case "월":
			System.out.print("\t");
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 6) {
				System.out.println();
				}
			}
			break;

			case "화":
			System.out.print("\t\t");//어떻게 하
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 5) {
				System.out.println();
				}
			}
			break;
			
			case "수":
			System.out.print("\t\t\t");
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 4) {
				System.out.println();
				}
			}
			break;
			
			case "목":
			System.out.print("\t\t\t\t");
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 3) {
				System.out.println();
				}
			}
			break;
			
			case "금":
			System.out.print("\t\t\t\t\t");
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 2) {
				System.out.println();
				}
			}
			break;
			
			case "토":
			System.out.print("\t\t\t\t\t\t");
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 1) {
				System.out.println();
				}
			}
			break;
			
			case "일":
			for(i = 1; i <= c; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 0) {
				System.out.println();
				}
			}
			break;
		}
	}
}

