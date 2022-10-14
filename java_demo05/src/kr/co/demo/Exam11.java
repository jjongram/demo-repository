package kr.co.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Exam11 {

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
		int[][] arr = new int[3][];
		
		//1. 일반적인 1차 배열 생성.
		//2. 1차 배열을 동적 배열로 활용하여 랜덤값 추가.
		//3. 1차 배열의 참조 주소를 2차 배열의 행에 등록 -> arr[0] = 참조주소;
		
		
		for(int i = 0; i < arr.length; i++) {
			int[] arri = new int [0];
			for(int j = 0; j < n; j++) {
				int num = (int)((Math.random()*99)+1);//100미만에 해당하는 난수 생성
				
				int tmp[] = new int[arri.length + 1];
				
				for(int k = 0; k < arri.length; k++) {
					tmp[k] = arri[k];
				}
				
				tmp[tmp.length - 1] = num;//새로운 공간에 입력받은 값 추가
				
				arri = tmp;//주소 복사
				
			}
			arr[i] = arri;//주소 복사
		}
		for(int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
//			}
		}
	}

}
