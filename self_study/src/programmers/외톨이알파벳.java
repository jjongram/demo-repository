package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class 외톨이알파벳 {

	public static void main(String[] args) {
		String input_string = "edeaaabbccd";
		char[] c = input_string.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < c.length; i++) {
			list.add(String.valueOf(c[i]));
		}
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).equals(list.get(i-1))) {
				list.remove(list.get(i-1));
				i--;
			}
		}
		HashSet<String> set = new HashSet<>(list);
		Iterator<String> it = set.iterator();
		String answer = "";
		while(it.hasNext()) {
			String temp = it.next();
			int cnt = 0;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(temp)) {
					cnt++;
				}
			}
			if(cnt >= 2) {
				answer += temp;
			} 
		}
		if(answer.length()==0) {
			answer = "N";
		}
		System.out.println(answer);
	}
}
