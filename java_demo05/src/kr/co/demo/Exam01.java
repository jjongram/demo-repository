package kr.co.demo;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 배열 크기가 3 인 정수 배열을 만들고 3 부터 시작하는
		 * 3의 배수 값으로 초기화 후 출력하세요.
		 */
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 3; 
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
	}

}
