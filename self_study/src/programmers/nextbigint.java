package programmers;

import java.util.Scanner;

public class nextbigint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binaryString = Integer.toBinaryString(n);
		int cnt1 = 0;
		int cnt2 = 0;
		int nextNum = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') {
				cnt1+=1;
			}
		}
		for(int i = n+1; ; i++) {
			String binaryString2 = Integer.toBinaryString(i);
			for(int j = 0; j < binaryString2.length(); j++) {
				if(binaryString2.charAt(j) == '1') {
					cnt2+=1;
				}
			}
			if(cnt1==cnt2) {
				nextNum = Integer.parseInt(binaryString2, 2);
				System.out.println(nextNum);
				break;
			}
		}
	}
}
