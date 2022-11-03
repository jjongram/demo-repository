package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println((int)'a');//97
		String str = sc.next();
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(i == (int)str.charAt(j)-97 && arr[i]==-1) {
					arr[i] = j;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", ""));
	}
}
