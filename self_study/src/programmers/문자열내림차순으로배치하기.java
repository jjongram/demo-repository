package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		char[] c = s.toCharArray();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < c.length; i++) {
			list.add((int)c[i]);
		}
		Collections.sort(list);
		Collections.reverse(list);
		String answer = "";
		for(int i = 0; i < list.size(); i++) {
			answer += String.valueOf(Character.toChars(list.get(i)));
		}
		System.out.println(answer);
	}
}
