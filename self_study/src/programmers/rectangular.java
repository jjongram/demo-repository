package programmers;

import java.util.Scanner;

public class rectangular {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
        	System.out.println();
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        }
	}
}
