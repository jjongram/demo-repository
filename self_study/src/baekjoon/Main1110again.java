package baekjoon;

import java.util.Scanner;

public class Main1110again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = n;
		int sum = 0;
		for(;;) {
			if(n < 10) {
				n = n + 10 * n;
				sum += 1;
				if(n == k) {
					System.out.println(sum);
					break;
				}
			}
			int m = (n%10) * 10 + (n/10 + n%10)%10;
			sum+=1;
			if(m == k) {
				System.out.println(sum);
				break;
			} else {
				n = m;
			}
		}
	}

}
