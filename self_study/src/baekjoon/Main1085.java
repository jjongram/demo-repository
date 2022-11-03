package baekjoon;

import java.util.Scanner;

public class Main1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int min = x;
		if (min > y) {
			min = y;
		}
		if (min > w-x){
			min = w-x;
		}
		if (min > h-y) {
			min = h-y;
		}
		System.out.println(min);
	}

}
