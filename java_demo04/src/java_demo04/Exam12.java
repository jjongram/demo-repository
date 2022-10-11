package java_demo04;

public class Exam12 {

	public static void main(String[] args) {
		/*
		 * 1 부터 시작하여 31 까지 출력하기 위한 출력 구문을
		 * 만든다. 단, 달력 처럼 1 줄에 7개의 값이 출력되어야
		 * 한다.(반드시 중첩 for 를 사용할 필요는 없음)
		 */
		int i, j;
		for(i = 1; i <= 31; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
