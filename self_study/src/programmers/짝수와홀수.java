package programmers;

public class 짝수와홀수 {

	public static void main(String[] args) {
		int num = 3;
		String answer = "";
		if(num % 2 == 0) {
			answer = "even";
		} else {
			answer = "Odd";
		}
		System.out.println(answer);
	}

}
