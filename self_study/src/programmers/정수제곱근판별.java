package programmers;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		long n = 121;
		double result = Math.sqrt(n);
		long answer = 0;
		if((int)result == Math.sqrt(n)) {
			result++;
			answer = (long)(result * result);
		} else {
			answer = -1;
		}
	}

}
