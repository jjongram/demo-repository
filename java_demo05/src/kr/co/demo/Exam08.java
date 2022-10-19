package kr.co.demo;

import java.util.Arrays;
import java.util.Random;

public class Exam08 {

	public static void main(String[] args) {
		/*
		 * 홀수에 해당하는 값만 6개 출력하시오.
		 */
		int[] arr = new int [0];
		
		Random rand = new Random();//random class
		
		
		for(int i = 0; i < 6; ) {
			int num = rand.nextInt(101);//101미만에 해당하는 난수 생성
			
			if(num % 2 == 0) {
				continue;
			}
			
			int tmp[] = new int[arr.length];
			
			tmp = Arrays.copyOf(arr, arr.length+1);//(array4의, 길이)

//			for(int j = 0; j < arr.length; j++) {
//				tmp[j] = arr[j];
//			}
			
			
			arr = tmp;//주소 복사
			
			tmp[tmp.length - 1] = num;//새로운 공간에 입력받은 값 추가
			
			i++;
			
		}
				
		for(int i = 0; i < arr.length; i++) { //array 출력
			System.out.printf("%d\t", arr[i]);
			
		}

	}

}
