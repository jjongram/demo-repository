package kr.co.demo;

import java.util.Random;

public class Exam09 {

	public static void main(String[] args) {
		int[] arr = new int [0];
		
		Random rand = new Random();//random class
		
		
		for(int i = 0; i < 6; i++) {
			int num = rand.nextInt(101);//101미만에 해당하는 난수 생성
			
			int tmp[] = new int[arr.length +1];
			
			System.arraycopy(arr, 0, tmp, 0, arr.length);			
			tmp[tmp.length - 1] = num;//새로운 공간에 입력받은 값 추가
			
			arr = tmp;//주소 복사
				
			}
		for(int i = 0; i < arr.length; i++) { //array 출력
			System.out.printf("%d\t", arr[i]);
		}
				

	}


}


