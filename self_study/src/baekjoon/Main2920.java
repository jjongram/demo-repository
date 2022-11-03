package baekjoon;

import java.util.Scanner;

public class Main2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<arr[i+1]) {
				System.out.println("ascending");
				break;
			} else if(arr[i]>arr[i+1]) {
				System.out.println("descending");
				break;
			} else {
				System.out.println("mixed");
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if arr[i]<arr[i+1] ;
			
			}

		
	}

}
