package programmers;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		int n = 6;
		String str = "수박";
		String answer = "";
		char[] c = str.toCharArray();
		for(int i = 0; i < n/2; i++) {
			answer += "수박";
		}
		for(int i = 0; i < n%2; i++) {
			answer += "수";
		}
	}
}
