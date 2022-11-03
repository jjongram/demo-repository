package kr.co.exam02;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
//		final String REGEX = "[0-9]+";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = '-';
		final String REGEX = "[0-9]+";
		String[] testArr = {str};
		boolean x = true;
		for(;;) {
			for(int i=0; i<testArr.length; i++) {
				if(testArr[i].matches(REGEX)) {
					x = true;
				}else {
					x = false;
				}
//				break;
			}
		boolean b = str.startsWith("010");
			if(!b||str.length()<11||!x) {
				System.out.println("try again with 010");
//				str = sc.nextLine();
				break;

			} else if(b) {
				str = str.replaceAll(str.substring(7, 11), "****");
				str = str.substring(0, 3) + c + str.substring(3, 7) + c + str.substring(7, 11);
//				str=str.replaceAll("[^0-9]","");
				System.out.println(str);
				break;
			}
		}
	}
}
