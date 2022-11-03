package baekjoon;

import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		int[] arr = new int[n];
		
//		for(int i = 0; i < arr.length; i++) {
//		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			} if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);

	}

}
