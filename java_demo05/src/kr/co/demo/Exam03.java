package kr.co.demo;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 5~10 사이의 정수 값을 입력 받아
		 * 입력 받은 정수값과 동일한 크기의 배열을 생성하세요.
		 * 그리고 배열의 값은 -1 로 초기화 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5 ~ 10 사이의 정수 입력.");
		int a = sc.nextInt();
		/* 선생님 풀이
		 * while(!(5 <= a && a <= 10)) {
		 * 		System.out.print("5 ~ 10 사이의 정수 입력 : ");
		 * 		a = sc.nextInt();
		 * }
		 */
		
		int[] arr = new int[a];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; 
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();


	}

}
