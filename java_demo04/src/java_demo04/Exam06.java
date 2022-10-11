package java_demo04;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if, for를 활용하여 사용자로부터 정수값을
		 * 입력 받았을 때 1 ~ 45 사이의 값이 아니면 다시 입력을 받아
		 * 1 ~ 45 사이의 값이 저장될 수 있게 한다.
		 * (단, 3번의 입력 기회만 부여하고 3번의 기회를 넘기면 0 값이
		 * 저장되게 한다. 
		 */
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력.");
		int x = sc.nextInt();
		int i;
//		for(; 1 > x || x > 45; ) {
//			if ( 1 > x || x > 45) {
//				System.out.println("다시 입력해주세요 1");
//			}
//			
//		}
//		for(i = 1; i<=3; i++) {
//			if(1 <= x && x <= 45) {
//				System.out.println(x);
//				break;
//			} else if(1 > x || x > 45) {
//				System.out.println("다시 입력해주세요");
//			}
//		}
		if(1 <= x && x <= 45) {
			System.out.println(x);
		} else if(1 > x || x > 45) {
			for(i = 1 ; i<=3, 1 <= x && x <= 45; i++) {
				
			}
		}
		
	}
	*/
		Scanner sc = new Scanner(System.in);
		int number = 0;
		for(int i = 1; i <= 3; i++) {
			System.out.println("1~45사이의 정수값 입력 : ");
			int inputNumber = sc.nextInt();
			
			if(inputNumber >= 1 && inputNumber <= 45) {
				number = inputNumber;
				break;
			} else {
				System.out.printf("입력 기회가 %d 번 남았습니다.\n", 3 - i);
			}
			
		}
		System.out.printf("%d 값이 저장되었습니다.\n", number);
	}
}
