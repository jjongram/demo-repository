package programmers;

public class 개미군단 {

	public static void main(String[] args) {
		int hp = 1;
		int answer = 0;
		
		int hp1 = hp % 5;
		answer += (hp / 5);
		
		int hp2 = hp1 % 3;
		answer += (hp1 / 3);
		
//		int hp3 = hp2 % 1;
		answer += (hp2 / 1);

		System.out.print(answer);
	}

}
