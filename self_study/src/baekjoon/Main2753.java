package baekjoon;

import java.util.Scanner;

public class Main2753 {

	public static void main(String[] args) {
		System.out.println("dd");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		if(year/4 == 0 && year / 100 !=100) {
			System.out.println(1);
		}
	}
}
