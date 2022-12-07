package programmers;

import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "aaaa";
		char[] c = s.toCharArray();
		int[] arr = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = (int)c[i];
		}
		boolean answer = true;
		if(s.length() == 4 || s.length() == 6) {
			for(int i = 0; i < s.length(); i++) {
				if(!(48 <= (int)arr[i] && (int)arr[i] <= 57)) {
					answer = false;
					break;
				}
			}
		}else if(!(s.length() == 4 || s.length() == 6)) {
			answer = false;
		}
		System.out.println(answer);
	}

}
