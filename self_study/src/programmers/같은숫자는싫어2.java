package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어2 {

	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		Stack s = new Stack();
		s.push(arr[0]);
		final int LENGTH = arr.length;
		for(int i = 1; i < LENGTH; i++) {
			if((int)s.peek() != arr[i]) {
				s.push(arr[i]);
			}
		}
		final int SIZE = s.size();
		int[] answer = new int[SIZE];
		for(int i = SIZE-1; i >= 0; i--) {
			answer[i] = (int)s.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}
