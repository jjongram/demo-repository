package kr.co.demo;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 받아서 다음의 기능을 수행하는 코드를 작성
		 * 		1. 입력한 횟수 만큼 정수 값을 입력 받아서 배열에
		 * 			저장 한다.
		 * 		2. 배열에 저장된 모든 정수의 합과 평균을 구하여 출력
		 * 		3. -1 입력이 들어오면 더 이상 사용자 입력을 받지 않는
		 * 			것으로 한다.
		 * 
		 * 예제
		 * 		1 번째 정수값 입력 : 7
		 * 		2 번쨰 정수값 입력 : 12
		 * 		3 번쨰 정수값 입력 : 24
		 * 		4 번쨰 정수값 입력 : -1
		 * 
		 * 		총합 : 43
		 * 		평균 : 14.3
		 */
		Scanner sc = new Scanner(System.in);

		int[] arr = new int [0];
		int a = 0;
		while (a != -1) {
			System.out.println("정수를 입력하시오.");
			a = sc.nextInt();
			if (a == -1) {
				break;
			}
				
			int tmp[] = new int[arr.length + 1];
					
			for(int j = 0; j < arr.length; j++) {
				tmp[j] = arr[j];
			}
					
			tmp[tmp.length - 1] = a;//새로운 공간에 입력받은 값 추가
					
			arr = tmp;//주소 복사
									
		}
		for(int i = 0; i < arr.length; i++) { //array 출력
			System.out.printf("%d\t", arr[i]);
		}
		int sum = 0;
		double average = 0;
			
		for(int i = 0; i < arr.length; i++) {//덧샘
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			average = (double)sum/arr.length;
		}
			System.out.println();
			System.out.printf("총 합 : %d\n", sum);
			System.out.printf("평 균 : %.2f", average);
		}
	}


