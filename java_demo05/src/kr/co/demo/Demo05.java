package kr.co.demo;

import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		/*
		 * 깊은 복사
		 * 		반복문을 사용한 깊은 복사
		 * 
		 * 		System.arraycopy(...) 를 사용한 깊은 복사
		 * 
		 * 		Arrays.copyOf(...)	를 사용한 깊은 복사
		 * 
		 * 		배열변수명.clone() 을 사용한 깊은 복사
		 */
		int arr1[] = new int[] {1,2,3,4};
		
		//반복문을 사용한 깊은 복사
		int arr2[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// System.arraycopy(...)
		int arr3[] = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);//(원본, 's 시작 위치, 복사본, 's 시작위치, 갯수)
		
//		System.out.println(arr1 + "\t" + arr3);
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr1[%d] = %d\tarr3[%d] = %d\n", i, arr1[i], i, arr3[i]);
		}
		
		// Arrays.copyOf(...)
		int arr4[];
		arr4 = Arrays.copyOf(arr1, arr1.length);//(array4의, 길이)
		
//		System.out.println(arr1 + "\t" + arr4);
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d] = %d\n", i, arr4[i]);
		}
		
		//배열변수명.clone()
		int arr5[] = arr1.clone();
		
//		System.out.println(arr1 + "\t" + arr5);
		for(int i = 0; i < arr5.length; i++) {
			System.out.printf("arr1[%d] = %d\tarr5[%d] = %d\n", i, arr1[i], i, arr5[i]);
		}

		
	}

}
