package kr.co.demo;

import java.util.Random;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 배열의 크기가 0 인 정수  배열을 생성 후
		 * 난수(Random) 를 사용하여 0 ~ 100 까지의 임의값
		 * 을 생성 후 배열에 추가한다.
		 * 총 6개의 정수 값을 추가하도록 한다.
		 */
		int[] arr = new int [0];
		
		Random rand = new Random();//random class
		
		
		for(int i = 0; i < 6; i++) {
			int num = rand.nextInt(101);//101미만에 해당하는 난수 생성
			
			int tmp[] = new int[arr.length + 1];
			
			for(int j = 0; j < arr.length; j++) {
				tmp[j] = arr[j];
			}
			
			tmp[tmp.length - 1] = num;//새로운 공간에 입력받은 값 추가
			
			arr = tmp;//주소 복사
			
		}
				
		for(int i = 0; i < arr.length; i++) { //array 출력
			System.out.printf("%d\t", arr[i]);

		}
	}
}
