package programmers;

public class 일이될때까지 {

	public static void main(String[] args) {
		int n = 25;
		int k = 5;
		int cnt = 0;
		while(n!=1) {
			if(n % k != 0) {
				n--;
				cnt++;
			} else {
				n/=k;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
