package baekjoon;

import java.util.Scanner;

public class Main5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int s = 0;
		for(int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A' :
			case 'B' :
			case 'C' :
				s = s+3;
				break;	
			case 'D' :
			case 'E' :
			case 'F' :
				s = s+4;

				break;	
			case 'G' :
			case 'H' :
			case 'I' :
				s = s+5;

				break;	
			case 'J' :
			case 'K' :
			case 'L' :
				s = s+6;

				break;	
			case 'M' :
			case 'N' :
			case 'O' :
				s = s+7;

				break;	
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' :
				s = s+8;

				break;	
			case 'T' :
			case 'U' :
			case 'V' :
				s = s+9;

				break;	
			case 'W' :
			case 'X' :
			case 'Y' :
			case 'Z' :
				s = s+10;

				break;	
				
			}
		}
		System.out.println(s);
	}

}
