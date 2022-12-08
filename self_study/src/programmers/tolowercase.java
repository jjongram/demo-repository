package programmers;

import java.util.Scanner;

public class tolowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); 
		boolean answer = true;
		str = str.toLowerCase();
		int cntp = 0;
		int cnty = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'p') {
				cntp += 1;
			} else if(str.charAt(i) == 'y') {
				cnty += 1;
			}
		}
		if(cntp == cnty) {
			answer = true;
		} else if(cntp != cnty) {
			answer = false;
		}
		System.out.println(answer);
	}

}
