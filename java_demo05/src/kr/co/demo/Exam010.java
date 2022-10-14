package kr.co.demo;

import java.util.Scanner;

public class Exam010 {

	public static void main(String[] args) {
		/*
		 * 3행, n 열에 해당하는 2차 배열을 만들어보세요.
		 * 		1. n 은 사용자 입력을 통해 3~ 9 사이의 정수를 받아 사용하세요.
		 * 		2. 배열에 초기화 하는 데이터는 랜덤을 사용하여 1~99 사이의 값을
		 * 			저장하도록 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("3~9 사이의 정수를 입력하시오.");
		int n = sc.nextInt();
		
		while(!(3<=n && n<=9)) {
			System.out.println("3~9 사이의 정수를 입력하시오.");
			n = sc.nextInt();

			if(3<=n && n<=9) {
				break;
			}
		}
		int[][] arr = new int[3][n];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j= 0; j < arr[i].length; j++) {
				arr[i][j] = (int)((Math.random()*99)+1);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j= 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] -> %d\n", i, j, arr[i][j]);
			}
		}
	}
}
