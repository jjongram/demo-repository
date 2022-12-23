package programmers;

import java.util.Scanner;

public class 시각 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String till = sc.nextLine() + "5959";
		System.out.println(till);
		int h = 0;
		int m = 0;
		int s = 0;
		String time = String.valueOf(h)+String.valueOf(m)+String.valueOf(s);
		System.out.println(String.valueOf(h)+String.valueOf(m)+String.valueOf(s));
		while(!till.equals(String.valueOf(h)+String.valueOf(m)+String.valueOf(s))) {
			s++;
			m = s/60;
			h = m/60;
			System.out.println(time);
		}
	}

}
