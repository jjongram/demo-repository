package kr.co.demo;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * 배열 복사
		 * 		얕은 복사
		 * 			배열의 참조 주소만을 복사하여 동일한 데이터를
		 * 			공유하여 사용하게 만드는 복사
		 * 
		 * 		깊은 복사
		 * 			새로운 배열을 생성하여 각 배열마다 다른 참조 주소를
		 * 			사용하여 서로 다른 데이터를 사용하게 만드는 복사
		 */
		int arr1[] = new int [3];
		
		arr1[0] = 1; arr1 [1] = 2; arr1[2] = 3;
		
		// 얕은 복사.
		int arr2[] = arr1;
		
		// 깊은 복사를 위해 새로운 배열 생성.
		int arr3[] = new int[arr1.length];
		
		// 새로 생성한 배열에 값 복사.
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		// 깊은 복사 후 값 변경
		arr3[2] = 30;
		
		System.out.println(arr1 + "\t" + arr2 + "\t" + arr3);
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> %d\tarr2[%d] -> %d\n", i, arr1[i], i, arr2[i]);;
		}
	}

}
