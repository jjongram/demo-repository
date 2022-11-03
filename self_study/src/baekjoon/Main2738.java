package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		String a = br.readLine();
		String b = br.readLine();
		int[][] arr1 = new int[Integer.parseInt(a)][Integer.parseInt(b)];
		int[][] arr2 = new int[Integer.parseInt(a)][Integer.parseInt(b)];
		int[][] arr3 = new int[Integer.parseInt(a)][Integer.parseInt(b)];


		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println("1");
//				String[] A = br.readLine().split(" ");
				arr1[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println("2");
				arr2[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(arr3).replace("], ", " \n").replace("[[", "").replace("]]", "").replace("[", "").replace(",", ""));
	}

}
