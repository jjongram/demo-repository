package java_demo04;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * 문자열 비교
		 */
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		s1 = "Hello";
		
		System.out.println("Hello 라고 입력하세요. : ");
		s2 = sc.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("입력한 문자열이 Hello 입니다.");
		} else {
			System.out.println("입력한 문자열이 Hello 가 아닙니다.");
		}
	}

}
