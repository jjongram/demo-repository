package programmers;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 11;
		String str = String.valueOf(x);
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += (int)str.charAt(i)-48;
		}
		if(x % sum == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
