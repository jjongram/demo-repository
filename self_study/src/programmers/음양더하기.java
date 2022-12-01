package programmers;

public class 음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = {1,2,3};
		boolean[] signs = {false, false, true};
		int answer = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == false) {
				absolutes[i] *= -1;
			}
			answer += absolutes[i];
		}
	}

}
