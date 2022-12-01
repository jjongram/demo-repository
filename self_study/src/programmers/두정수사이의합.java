package programmers;

public class 두정수사이의합 {

	public static void main(String[] args) {
		int a = 10000000;
		int b = 0;
		int max = 0;
		int min = 0;
		if(a>b) {
			max = a;
			min = b;
		} else if(a<=b) {
			max = b;
			min = a;
		} 
		long sum = 0;
		for(int i = min; i <= max; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
