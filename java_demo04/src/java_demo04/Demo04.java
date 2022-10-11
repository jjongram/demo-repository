package java_demo04;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * 		프로그램 수행 흐름을 바꾸는 역할을 하는 제어문중 하나로
		 * 		특정 문장을 반복해서 수행하도록 한다.
		 * 
		 * 		반복문은 for, while 두 가지의 반복문이 있다.
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 		반복 수행할 코드;
		 * }
		 * 
		 * 초기식 : 변수를 초기화 하기 위한 식이 위치한다. (생략가능)
		 * 			반복문이 시작할 때 최초 1회만 동작
		 * 조건식 : 반복문을 계속 수행할지에 대한 조건이 위치한다. (생략가능)
		 * 			조건식의 결과가 참이면 반복문 안의 코드를 실행
		 * 			조건식의 결과가 거짓이면 반복문을 중단하고 다음 코드로 넘어감
		 * 			반복문이 시작할 때 뿐만아니라 반복이 이루어지면 계속 실행한다.
		 * 증감식 : 보통 초기식에 초기화한 변수의 값을 증감시키기 위해 사용(생략가능)
		 * 			반복문의 마지막 코드가 실행된 후에 수행되는 코드
		 * 			반복문이 처음 시작할 때에는 동작하지 않는다.
		 * 
		 * 반복문 안에 break 를 사용하면 반복문을 중단할 수 있다.
		 * 반복문 안에 continue 를 사용하면 반복문의 처음으로(증감식) 으로 이동한다.
		 */
		
		/*int x1;
		
		for(x1 = 1; x1 <= 3; x1++) {
			System.out.printf("%d 번째 반복\n\n", x1);
		}*/
		/*for(int x2 = 1; x2 <= 3; x2++) {
			System.out.printf("%d 번째 저장된 값 -> ", x2);
		}
		//System.out.println("x2 변수에 저장된 값 -> ", + x2);
		 * 
		 */
		
		/*int x3 = 1;
		
		for(; x3 <= 3; x3=x3+2) {
			System.out.printf("%d 번째 반복\n", x3);
		}
		*/
		
		/*
		int x4 = 1;
		for(;; x4++) {
			System.out.printf("%d 번째 반복\n", x4);
			if(x4 >= 587498) {
				break;
			}
		}
		*/
		
		/*
		int x5 = 1;
		for(; x5 <= 3;) {
			System.out.printf("%d 번째 반복\n", x5);
			x5++;
		}
		*/
		
		/*
		for(;;) {
			System.out.printf("무한 반복이 필요할 때 사용하세요.");
		}
		*/
		
		/*for(int i = 10; i >= 1; i--) {
			System.out.printf("%d\n", i);
		}
		*/
		
		//중첩 반복
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\t", j, i, j * i);
			}
			System.out.print("\n");
		}
	}

}
