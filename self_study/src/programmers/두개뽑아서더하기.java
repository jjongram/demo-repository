package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = new int[set.size()];
		Iterator it = set.iterator();
		for(int i = 0; i < set.size(); i++) {
			answer[i] = (int)it.next();
		}
		Arrays.sort(answer);
		System.out.print(Arrays.toString(answer));
	}

}
