package baekjoon;

import java.util.Scanner;

public class Main2738again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr1 = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int[][] arr2 = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int[][] arr3 = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		 for (int i = 0; i < arr3.length; i++) {
	            int[] inArr = arr3[i];
	            for (int j = 0; j < inArr.length; j++) {
	                System.out.print(inArr[j] + " ");
	            }
	            System.out.println();
	        }

	}

}
