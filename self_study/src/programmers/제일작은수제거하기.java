package programmers;

import java.util.ArrayList;
import java.util.List;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {4,3,10,2};
		int min = arr[0];
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		if(list.size() == 1) {
			list.set(0, -1);
		} else {
			for(int i = 0; i < list.size(); i++) {
				if(min > list.get(i)) {
					min = list.get(i);
				}
			}
			list.remove(new Integer(min));
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
	}
}
