package programmers;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		for(int i = str.length()-1; i >= 0; i--) {
			answer[str.length() - 1 - i] = str.charAt(i)-48;
		}
		System.out.println(Arrays.toString(answer));
	}

}
