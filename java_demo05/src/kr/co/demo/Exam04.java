package kr.co.demo;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 2 ~ 5 사이의 정수 값을 입력 받아
		 * 입력 받은 정수값과 동일한 크기의 배열을 생성 하고,
		 * 배열의 값을 초기화 하기 위해 다시 사용자 입력을 사용하여
		 * 1 ~ 10 사이의 값만을 입력 받아 초기화 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2 ~ 5 사이의 정수 입력.");
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("1 ~ 10 사이의 정수 입력.");
			int b = sc.nextInt();
			arr[i] = b; 
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();

	}

}
