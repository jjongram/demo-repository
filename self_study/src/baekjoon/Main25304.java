package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x");
		int X = sc.nextInt();
		
		System.out.println("n");
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("a");
			int a = sc.nextInt();
			arr[i][0] = a;
			
			System.out.println("b");
			int b = sc.nextInt();
			arr[i][1] = b;
		}
			
		int s = 0;
		
		for(int i = 0; i < arr.length; i++) {
			s += (arr[i][0] * arr[i][1]);
		}
		if (X == s) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
