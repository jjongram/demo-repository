package java_demo04;

public class Exam09 {

	public static void main(String[] args) {
		/*
		 * 7 부터 시작하여 7의 배수에 해당하는 값을 출력할 때
		 * 150 이전에 출력되는 7의 배수 값과 총 반복 횟수를
		 * 출력하시오.
		 */
		int i = 7;
		int cnt = 0;
		for(; i <= 150; i += 7) {
			System.out.println(i);
			cnt = ++cnt; //cnt += 1
//			System.out.println(cnt);
		}
		System.out.println("총 반복 횟수 : " + cnt);
	}

}
