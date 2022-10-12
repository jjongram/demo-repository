package kr.co.demo;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 배열 크기가 5 인 정수 배열을 만들고 5 부터 -1씩 감소된
		 * 값으로 초기화 후 출력하세요.
		 */
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 5-1*i; 
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();


	}

}
