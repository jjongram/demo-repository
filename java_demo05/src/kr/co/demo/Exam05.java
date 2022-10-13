package kr.co.demo;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		/*
		 * Exam04.java 와 동일한 과정으로 배열을 생성할 때
		 * 중복된 값이 없도록 초기화 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2 ~ 5 사이의 정수 입력.");
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("1 ~ 10 사이의 정수 입력.");
			int b = sc.nextInt();
			arr[i] = b; 
//			if(arr[i] == b) {
//				System.out.println("중복이 있습니다.");
			}

		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();

	}

}
