package programmers;

import java.util.Arrays;

public class 분수덧샘 {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int denum1, int num1, int denum2, int num2) {
		        int denum3 = denum1 * num2 + denum2 * num1;
		        int num3 = num1 * num2;
		        int min = 0;
		        if(denum3 > num3) {
		            min = num3;
		        } else if(denum3 < num3) {
		            min = denum3;
		        } else if(denum3 == num3) {
		            denum3 = 1;
		            num3 = 1;
		        }
		        for(int i = 1; i <= min; i++) {
		            if(denum3 % i == 0 && num3 % i == 0) {
		                denum3 /= i;
		                num3 /= i;
		                i = 1;
		            }
		        }
		        int[] answer = {denum3, num3};
		        return answer;
		    }
		}
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(6, 4, 2, 4))); 
	}

}
