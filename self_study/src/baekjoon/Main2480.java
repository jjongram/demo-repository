package baekjoon;

import java.util.Scanner;

public class Main2480 {

	public static void main(String[] args) {
		/*1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 */
		System.out.println("dd");
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split(" ");
		
		int x = Integer.valueOf(input[0]);
		int y = Integer.valueOf(input[1]);
		int z = Integer.valueOf(input[2]);
		
		int s = 0;
		int b = 0;
		
		if (x == y && y == z) {
			s = 10000 + (x*1000);
		} else if (x!=y && x!=z && y!=z) {
			if(x > y && x > z) {
				b = x;
			} else if (y > z && y > x) {
				b = y;
			} else if (z > y && z > x) {
				b = z;
			} s = b*100;
		} 	if ((x==y && x!=z)) {
				s = 1000 + 100 * x; 	
			} else if (x==z && x!=y) {
				s = 1000 + 100 * x;
			} else if (y==z && y!=x) {
				s = 1000 + 100 * y;
			}
			
		System.out.print(s);

	}

}
