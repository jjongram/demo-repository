package programmers;

public class 평균구하기 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
	}

}
