package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class 곱하기혹은더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i)-'0';
		}
		int sum = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i]<=1 || arr[i+1]<=1) {
				sum += arr[i+1];
			} else {
				sum *= arr[i+1];
			}
		}
		System.out.println(sum);
	}

}
