package kr.co.Exam03;

public class Demo {

	public static void main(String[] args) {
		Clock clock = new Clock(8, 5, 2);
		clock.nextSecond();
		System.out.println(clock.nextSecond());
	}

}
