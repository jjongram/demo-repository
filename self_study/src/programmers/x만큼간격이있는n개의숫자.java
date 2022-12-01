package programmers;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		int x = 10000000;
		int n = 1000;
		long[] answer = new long[n];
		for(int i = 1; i <= n; i++) {
			answer[i-1] += (long) x * (i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
