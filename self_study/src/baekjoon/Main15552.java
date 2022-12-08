package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fast {
	String T;
	String A;
	String B;
	
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

	public Fast() { }

	public void d () throws IOException {
		System.out.println("dd");
		T = b.readLine();
		int[][] arr = new int[Integer.parseInt(T)][2];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("aa");
			A = b.readLine();
			arr[i][0] = Integer.parseInt(A);
			System.out.println("bb");
			B = b.readLine();
			arr[i][1] = Integer.parseInt(B);
			System.out.println(Integer.parseInt(A)+Integer.parseInt(B));
		}
	}
	
}

public class Main15552 {

	public static void main(String[] args) throws IOException {
		Fast f = new Fast();
		f.d();
	}
}
