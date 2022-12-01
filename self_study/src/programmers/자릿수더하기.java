package programmers;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		String str = "";
		str = String.valueOf(n);
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += (int)str.charAt(i)-48;
		}
	}

}
