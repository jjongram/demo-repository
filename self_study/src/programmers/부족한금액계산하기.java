package programmers;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 2500;
		int money = 1000000000;
		int count = 2500;
		long sum = 0;
		for(int i = 1; i <= count; i++) {
			sum += price * i;
		}
		long answer = -1;
		answer = sum - money;
		if(answer <= 0) {
			answer = 0;
		}
		System.out.println(answer);
	}

}
