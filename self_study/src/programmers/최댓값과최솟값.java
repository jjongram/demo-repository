package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] arr = s.split(" ");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		Collections.sort(list);
		String answer = "";
		answer += list.get(0);
		answer += " ";
		answer += list.get(list.size()-1);
		System.out.println(answer);
		
	}

}
