package kr.co.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
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
					
			tmp = Arrays.copyOf(arr, arr.length);
			
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
