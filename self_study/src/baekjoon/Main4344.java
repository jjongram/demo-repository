package baekjoon;

import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int [] arr = new int[m];
			
			for(int j = 0; j < m; j++) {
				arr[j] = sc.nextInt();
			}
			int sum = 0;
			double avg = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[j];
			}
			avg = (double)sum/arr.length;
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%" , (double)cnt/arr.length*100);
		}
	}

}
