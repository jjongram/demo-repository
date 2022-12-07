package programmers;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 13;
		int m = 5;
		int max = 0;
		int min = 0;
		int big = 0;
		int small = 0;
		if(n > m) {
			max = n;
			min = m;
		} else {
			max = m;
			min = n;
		}
		for(int i = 1; i <= min; i++) {
			if(max % i == 0 && min % i == 0) {
				big = i;
			}
		}
		small = max * min / big;
		int[] answer = {big, small};
	}

}
