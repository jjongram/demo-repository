package java_demo04;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 * 다음과 같은 출력이 나오도록 하시오.(중첩 for 를 사용하세요.)
		 * 1
		 * 2	3
		 * 4	5	6
		 * 7	8	9	10
		 * 11	12	13	14	15
		 */
//		for(int k = 1; k <= 15; k++)
		int k = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%d\t", k++);
			}
			System.out.println();
		}
	}
}
