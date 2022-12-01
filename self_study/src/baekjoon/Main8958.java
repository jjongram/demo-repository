package baekjoon;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		String str1 = sc.next();
		for(int i = 0; i < str1.length(); i++) {
			for(;;) {
				int n = 0;
				if(str1.charAt(i)=='O') {
					n=i+1;
				}
			}
		}
		
//		for(int i = 0; i < n; i++) {
			int sum = 0;
			String str = sc.next();
			for(int j = 0; j < str.length(); j++){
				if(str.charAt(j)=='O') {
					sum+=1;
				}
			}
			System.out.println(sum);
//		}
				
	}

}
