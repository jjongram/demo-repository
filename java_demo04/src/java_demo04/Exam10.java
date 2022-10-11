package java_demo04;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 사용자가 입력한 정수값 만큼
		 * 반복을 수행하는 반복문을 작성하시오. ex) 3입력 = 1 2 3
		 * (사용자 입력값이 0 이하인 경우 1 이상의 값을 입력
		 * 하세요 라는 메시지를 출력하고 종료한다.)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력.");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("1 이상의 값을 입력하세요.");
		}
		
		for(int i=1 ; i <= n; i++) {
				System.out.print(i );
		}
	}
}
