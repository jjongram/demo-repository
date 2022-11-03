package baekjoon;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int m = 0;
		int c = -1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(m < arr[i]) {
				m = arr[i];
				c = i;
			}
		}
		System.out.println(m);
		System.out.println(c+1);
	}

}
