package programmers;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		int answer = 0;
		for(int i = left; i <= right; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
//			System.out.println(cnt);
			if(cnt % 2 == 0) {
				answer += i;
			} else if(cnt % 2 != 0) {
				answer -= i;
			}
		}
		System.out.println(answer);
	}

}
