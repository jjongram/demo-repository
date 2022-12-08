package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2490 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
		for(int j = 1; j <= 3; j++) {
			String[] a = br.readLine().split(" ");
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(a[i]);
			}
	
			int s = 0;
			for(int i = 0; i < arr.length; i++) {
				s += arr[i];
			}
			if (s==1) {
				System.out.println("C");
			} else if(s==2) {
				System.out.println("B");
			} else if(s==3) {
				System.out.println("A");
			} else if(s==0) {
				System.out.println("D");
			} else if(s==4) {
				System.out.println("E");
			}
			
		}
	}
}
