package baekjoon;

import java.util.Scanner;


class Printt {
	int a;
	int b;
	
	public Printt() { }
	
	Scanner sc = new Scanner(System.in);
	
	public int getResult() {
		System.out.println("dd");
		this.a = sc.nextInt();
		System.out.println("dd");
		this.b = sc.nextInt();
		return a - b;
	}
}

public class Main1001 {

	public static void main(String[] args) {
		Printt p = new Printt();
//		p.getResult();
		System.out.println(p.getResult());
		
	}
}
