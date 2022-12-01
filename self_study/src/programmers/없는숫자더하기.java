package programmers;

import java.util.ArrayList;
import java.util.List;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		for(int i = 0; i < numbers.length; i++) {
			list.remove(new Integer (numbers[i]));
		}
		int answer = 0;
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
	}
}
