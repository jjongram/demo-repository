package baekjoon;

import java.util.Scanner;

public class jiwon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력하세요 : ");
		String[] arr = sc.nextLine().split(" ");
		System.out.println("사람 수를 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.printf("1인당 %.1f원 입니다", (double)sum/n);
		
	}

}
