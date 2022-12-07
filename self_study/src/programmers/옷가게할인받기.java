package programmers;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 10;
		double result = 0;
		int answer = 0;
		if(price >= 100000 && price < 300000) {
			result = price * 0.95;
		} else if(price >= 300000 && price < 500000) {
			result = price * 0.9;
		} else if(price >= 500000) {
			result = price * 0.8;
		} else {
			result = price;
		}
		answer = (int)result;
		System.out.println(answer);
	}

}
