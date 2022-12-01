package programmers;

public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		int n = 12;
		for(int i = 1; i <= n; i++) {
			if(n % i == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}
