package baekjoon;

import java.util.Scanner;

public class Main1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		double rr = 0;
		if(r2>r1) {
			rr=r2-r1;
		} else if(r1>r2) {
			rr=r1-r2;
		}
		
			double d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); //터렛간 거리
			if(rr<d && d<r1+r2) {
				System.out.println(2);
			} else if((d == r1 + r2 || d == rr)&&!(x1 == x2 && y1 == y2 && r1 == r2)) {
				System.out.println(1);
			} else if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else {
				System.out.println(0);
			}
		}

	}

}
