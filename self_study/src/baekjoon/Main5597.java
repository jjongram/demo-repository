package baekjoon;

import java.util.Scanner;

public class Main5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[30];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		int[] arr2 = new int[28];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[2];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					arr1[i]=arr1[i]-arr2[j];
				}
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=0) {
				System.out.println(arr1[i]);
			}
		}
	}

}
