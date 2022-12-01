package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {3, 6};
		int divisor = 5;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		if(list.size() == 0) {
			list.add(-1);
		} 
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
	}

}
