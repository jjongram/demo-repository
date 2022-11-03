package baekjoon;

import java.util.Scanner;

public class Main2566 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int a = 0;
		int b = 0;
		int m = -1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(m < arr[i][j]) {
					m = arr[i][j];
					a = i+1;
					b = j+1;
				}
			}
		}
		System.out.println(m);
		System.out.printf("%d %d", a, b);

	}

}
