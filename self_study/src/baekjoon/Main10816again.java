package baekjoon;

import java.util.Scanner;

public class Main10816again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[m];
		
		for(int i = 0; i < m; i++) {
			int sum = 0;
			for(int j = 0; j < n; j++) {
				if(arr2[i] == arr1[j]) {
					sum+=1;
				}
			}
			arr3[i] = sum;
		}
		for(int i = 0; i < m; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
