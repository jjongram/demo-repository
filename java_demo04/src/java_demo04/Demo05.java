package java_demo04;

public class Demo05 {

	public static void main(String[] args) {
		/*
		 * while 반복문
		 * 
		 * while(조건식) {
		 * 		실행 코드;
		 * }
		 * 
		 * 조건식의 결과 값이 참일 때 반복을 수행하며, 거짓이 되면
		 * 반복을 중단한다.
		 * 
		 *  break, continue 를 사용하여 반복문을 제어할 수 있다.
		 */
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		//for(int i = 0; i < 5; i++) {
		//		System.out.println(i);
		//}
		
		while(true) {
			System.out.println("무한 반복");
			break;
		}
		
		/*
		 * do while 반복문
		 * 		일단 1회 반복을 수행 후 조건식의 결과에 따라 참이면 반복을 계속 진행
		 * 		거짓이면 반복 중단
		 * 
		 * do {
		 * 		실행 코드
		 * }	while(조건식);
		 */

		do {
			System.out.println("조건식의 결과가 거짓이어도 일단 1회를 실행함.");
		} while(false);
	}

}
