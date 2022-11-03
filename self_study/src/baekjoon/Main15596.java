package baekjoon;

import java.util.Scanner;

class Test {
	public int n;
	public int a;
	public int s;
	
	public Test () { }
	
	Scanner sc = new Scanner(System.in);
	
	public void getSum(int n) {
		int[] arr = new int[this.n = sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		System.out.println(s);
		
	}
}