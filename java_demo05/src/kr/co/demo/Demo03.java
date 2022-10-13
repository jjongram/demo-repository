package kr.co.demo;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * 동적 배열
		 */
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[3];
		arr1[0] = 1; arr1[1] = 2; arr1[2] = 3;//배열 생성
		
		System.out.println("기존 배열의 참조 주소 ->" + arr1);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("정수값 입력 : ");
			int num = sc.nextInt();
			
			int tmp[] = new int[arr1.length + 1];
			
			for(int j = 0; j < arr1.length; j++) {
				tmp[j] = arr1[j];
			}
			
			tmp[tmp.length - 1] = num;//새로운 공간에 입력받은 값 추가
			
			arr1 = tmp;//주소 복사
			
			System.out.println("%d 값을 배열 arr1 에 추가하였습니다.");
		}
		
		System.out.println("새로운 배열의 참조 주소 ->" + arr1);
		
		for(int i = 0; i < arr1.length; i++) { //array 출력
			System.out.printf("%d\t", arr1[i]);
		}
		
	}
}
