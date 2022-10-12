package kr.co.demo;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 배열
		 * 		동일한 자료형의 데이터를 변수 공간에 담아서 사용할 수 있게
		 * 		만들어 주는 것
		 * 		저장된 데이터마다 인덱스가 부여되며, 인덱스 번호는 0 부터
		 * 		시작한다.
		 * 
		 * 배열 변수 선언
		 * 		int[] 변수명;
		 * 		int 변수명[];
		 * 
		 * 초기화
		 * 		변수명 = new int[배열크기];
		 * 		변수명 = {1, 2, 3, 4, ...};
		 * 
		 * 배열 변수 선언 후 즉시 초기화
		 * 		int[] 변수명 = new int[배열크기];
		 * 		int 변수명[] = new int[배열크기];
		 * 		int[] 변수명 = {1, 2, 3, 4, ...}
		 * 		int 변수명[] = {1, 2, 3, 4, ...}
		 * 
		 * 배열 크기는 배열에 담을 데이터의 수로 작성하면 된다.
		 * int[] arr1 = new int[3];
		 * 
		 * 배열에 저장된 데이터는 기본값으로 초기화되어 있기 때문에 별도의
		 * 초기화 작업이 필요 없다.
		 * 		정수는 초기값 0
		 * 		실수는 초기값 0.0
		 * 		불리언은 초기값 false
		 * 		문자열 초기값 null
		int x[] = new int[3];
		double y[] = new double[3];
		boolean z[] = new boolean[3];
		String a[] = new String[3];
		
		System.out.println(x[0]);
		System.out.println(y[0]);
		System.out.println(z[0]);
		System.out.println(a[0]);
		
		 *배열의 크기를 알아내기 위한 방법으로 length 속성을 사용한다.
		 *
		 *배열의 특정 위치의 값을 추출하거나 재할당 하기 위해 인덱스 번호를 사용한다.
		 *
		 *배열의 크기는 한번 정해지면 바꿀 수 없다.(고정 크기)
		 *
		 *동적 배열을 사용하면 배열의 크기를 변경할 수 있지만 기존 배열의 크기를
		 *변경하는 것이 아닌 새로운 배열을 기존보다 크게 또는 작게 만들어서
		 *사용하는 것이다. 기존에 저장 했던 데이터는 복사해야 함.
		 */
//		boolean x[] = new boolean[5];
//		System.out.println(x.length);
		int arr1[] = new int[3];
		
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = 10;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d\t", arr1[i]);
		}
		System.out.println();

	}

}
