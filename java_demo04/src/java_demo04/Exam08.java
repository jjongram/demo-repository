package java_demo04;

public class Exam08 {

	public static void main(String[] args) {
		/*
		 * 총 15번 반복하는 반복문을 사용하고 3 부터 시작하여
		 * 45 까지 3 의 배수에 해당하는 값만 출력하는 코드를
		 * 작성하시오.
		 */
//		for(int x = 3; x <= 45 ; x += 3) {
//			System.out.println(x);
//		}
		int x = 3;
		while(x <= 45) {
			System.out.println(x);
			x += 3;
		}
	}

}
