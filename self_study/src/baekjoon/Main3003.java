package baekjoon;

import java.util.Scanner;

public class Main3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = {1, 1, 2, 2, 2, 8};
		
		int arr2[] = new int[6];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d ", arr1[i]-arr2[i]); 
		}
	}

}
