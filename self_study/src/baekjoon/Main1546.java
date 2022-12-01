package baekjoon;

import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += ((double)arr[i]/max)*100;
		}
		System.out.println(sum/arr.length);
	}

}
