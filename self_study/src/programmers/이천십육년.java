package programmers;

import java.util.Date;

public class 이천십육년 {

	public static void main(String[] args) {
		int a = 2;
		int b = 28;
		String answer = "";
		Date date = new Date(2016, a, b);
		System.out.println(a);
		System.out.println(b);
//		System.out.println(date.getDay());
		switch(date.getDay()) {
			case 1: {
				answer = "THU";
				break;
			}
			case 2: {
				answer = "FRI";
				break;
			}
			case 3: {
				answer = "SAT";
				break;
			}
			case 4: {
				answer = "SUN";
				break;
			}
			case 5: {
				answer = "MON";
				break;
			}
			case 6: {
				answer = "TUE";
				break;
			}
			case 0: {
				answer = "WED";
				break;
			}
		}
		System.out.print(answer);
	}

}
