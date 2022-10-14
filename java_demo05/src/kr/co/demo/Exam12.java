package kr.co.demo;

import java.util.Arrays;

public class Exam12 {

	public static void main(String[] args) {
		/*
		 * 1.
		 * 		A. 3~10 사이의 랜덤값을 생성하면 이것을 1차 배열의 크기로 사용한다. 
		 * 		B. 1 차 배열의 크기가 정해지면 다시 5~ 10 사이의 랜덤값을 생성하고
		 * 			이것을 2차 배열의 크기로 사용한다.
		 * 		C. 2 차 배열까지의 크기가 정해지면 다시 10 ~ 99 사이의 랜덤값을 생성
		 * 			하고 이것을 2 차 배열에 초기값으로 사용한다.
		 * 		D. C 에 만들어진 2 차 배열을 전체 탐색을 통해 짝수는 별도의 짝수 배열에
		 * 			홀수는 별도의 홀수 배열에 저장한다.
		 * 		E. D 에서 만든 짝수 배열, 홀수 배열의 동일한 위치에 있는 정수값들의 합을
		 * 			구하고 구해진 합들만을 저장할 배열을 만든다.
		 */
		int size1 = (int)((Math.random()*8)+3);//3 ~ 10 랜덤값
		
		int size2 = (int)((Math.random()*6)+5);//랜덤값
		int[][] arr = new int[size1][size2];
		
		for(int i = 0; i < size1; i++) {
			for(int j = 0; j < size2; j++) {
				arr[i][j] = (int)((Math.random()*90)+10);
			}
		}
		
		for(int i = 0; i < size1; i++) {
			System.out.println(Arrays.toString(arr[i]));//C 완료
		}
		
		int[] even = new int[0];
		int[] odd = new int[0];//짝,홀 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2 == 0) { //짝수면,
					int tmp[] = new int[even.length + 1];//짝수 동적배열 선언, 생성

					for(int k = 0; k < even.length; k++) {
						tmp[k] = even[k];
					}

					tmp[tmp.length - 1] = arr[i][j];//새로운 공간에 입력받은 값 추가
					
					even = tmp;//주소 복사
				} else {
					int tmp[] = new int[odd.length + 1];//홀수 동적배열 선언, 생성

					for(int k = 0; k < odd.length; k++) {
						tmp[k] = odd[k];
					}

					tmp[tmp.length - 1] = arr[i][j];//새로운 공간에 입력받은 값 추가
					
					odd = tmp;//주소 복사

				}
			}
		}
			System.out.println(Arrays.toString(even));
			System.out.println(Arrays.toString(odd));
			 /* D 에서 만든 짝수 배열, 홀수 배열의 동일한 위치에 있는 정수값들의 합을
			 	구하고 구해진 합들만을 저장할 배열을 만든다.*/
			int common = 0;
			if(even.length >= odd.length) {
				common = odd.length;
			} else if (even.length <= odd.length) {
				common = even.length;
			}
			//int common = even.length < odd.length ? even.length : odd.length;
			
			int[] sum = new int[0];
			for(int i = 0; i < common; i++) {
				int tmp[] = new int[sum.length + 1];//합의 동적배열 선언, 생성

				for(int j = 0; j < sum.length; j++) {
					tmp[j] = sum[j];
				}
				
				tmp[tmp.length - 1] = even[i] + odd[i];//새로운 공간에 입력받은 값 추가
				
				sum = tmp;//주소 복사
			}
			System.out.println(Arrays.toString(sum));
	}
}

	


