package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class 상하좌우 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[][] map = new int[n+1][n+1];
		System.out.println(Arrays.toString(strArray));
		
		int x = 1;
		int y = 1;
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals("R")) {
				if(x < n) {
					x++;
				}
			} else if(strArray[i].equals("L")) {
				if(x > 1) {
					x--;
				}
			} else if(strArray[i].equals("U")) {
				if(y > 1) {
					y--;
				}
			} else if(strArray[i].equals("D")) {
				if(y < n) {
					y++;
				}
			}
		}
		System.out.print(y + " " + x);
	}

}
