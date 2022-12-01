package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		String str = String.valueOf(n);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			list.add((int)str.charAt(i)-48);
		}
		Collections.sort(list);
		Collections.reverse(list);
		String answer1 = "";
		for(int i = 0; i < list.size(); i++) {
			answer1 += String.valueOf(list.get(i)); 
		}
		Long.parseLong(answer1);
	}

}
