package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값만들기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i< numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list);
		int answer = list.get((list.size()-1)) * list.get((list.size()-2));
		System.out.println(answer);
	}

}
