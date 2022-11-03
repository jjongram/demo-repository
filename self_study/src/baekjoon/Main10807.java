package baekjoon;

import java.util.Scanner;

public class Main10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int s = 0;
		for(int i = 0; i < arr.length; i++) {
			if(v==arr[i]) {
				arr[i] = 1;
				s += arr[i];
			}
		}
		System.out.println(s);
	}

}
