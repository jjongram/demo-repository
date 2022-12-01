package baekjoon;

import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n= sc.nextLine();
		String m = n;
		int cnt = 0;
		for(;;) {
			while(Integer.parseInt(n) < 10) {
					n = String.valueOf(Integer.parseInt(n)*10 + Integer.parseInt(n));
					cnt += 1;
					if(n.equals(m)) {
						System.out.println(cnt);
						break;
					}
			}
			if(n.equals(m)) {
				System.out.println(cnt);
				break;
			}
			System.out.println(n);
			char[] c = new char[n.length()]; 
			for(int i = 0; i < n.length(); i++) {
				c[i] = n.charAt(i);
			}
			int result = ((int)c[0]-48) + ((int)c[1]-48); //2+6
			int newInt = (((int)c[1]-48)*10 + result%10); //새로운 숫자 : 1의 자리 + 자릿수끼리 더한것 6 + 8 
//			System.out.println(newInt);
			System.out.println("(int)c[0]-48) + ((int)c[1]-48) : " + result%10);
			n = String.valueOf(newInt);
			System.out.println("n : " + n);
			cnt += 1;
			if(n.equals(m)) {
				System.out.println(cnt);
				break;
			}
		}
	}

}
