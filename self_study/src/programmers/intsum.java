package programmers;

public class intsum {

	public static void main(String[] args) {
		int a = -1;
		int b = 10;
        int max = 0;
        int min = 0;
        if(a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else if (a == b) {
        	max = a;
        	min = b;
        }
        int count = max - min + 1;
        int sum = 0;
        for(int i = min; i < count+min; i++) {
            sum += i;
        }
        long answer = sum;
        System.out.println(answer);
	}

}
