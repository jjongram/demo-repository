package kr.co.self;

import java.util.Arrays;
import java.util.Scanner;

public class 시간더하기계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
//		System.out.println(Integer.parseInt(time)/10000);
		System.out.println(Arrays.toString(t));
		int total = 0;
		for(int i = 0; i < t.length; i++) {
			total += Integer.parseInt(t[i]);
		}
		System.out.println(total);
		
		int h = total/10000;
		int m = (total%10000)/100;
		int s = (total%10000)%100;
		System.out.println("h = " + h);
		System.out.println("m = " + m);
		System.out.println("s = " + s);
		
	}

}
