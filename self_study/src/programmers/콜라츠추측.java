package programmers;

public class 콜라츠추측 {

	public static void main(String[] args) {
		int num = 16;
		int cnt = 0;
		for(;;) {
			if(num == 1) {
				break;
			} else if(cnt == 500) {
				cnt = -1;
				break;
			}
			cnt++;
			if(num % 2 == 0) {
				num /= 2;
			} else if(num % 2 == 1) {
				num = num * 3 + 1;
			}
		}
		System.out.println(cnt);
	}

}
