package programmers;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "sldkfjsl   askldfjs dkfjk df";
		s = s.toLowerCase();
		String answer = "";
		String[] str1 = s.split(" ");
		Collection c1 = new LinkedList<>();
		for(int i = 0; i < str1.length; i++) {
			if(!str1[i].equals(" ")) {
				c1.add(str1[i]);
			}
		}
//		System.out.println(c1);
		Collection c = new LinkedList<>(Arrays.asList(str1));
		System.out.println(c);
		for(int i = 0; i < c.size(); i++) {
			if(((LinkedList<String>) c).get(i).isBlank()) {
				c.remove(i);
			}
		}
		System.out.println(c);
		final int LENGTH1 = str1.length;
		for(int i = 0; i < LENGTH1; i++) {
			final int LENGTH2 = str1[i].length();
			String[] str2 = str1[i].split("");
			for(int j = 0; j < LENGTH2; j++) {
				if(j%2==0) {
					str2[j] = str2[j].toUpperCase();
				}
				answer += str2[j];
			}
			answer += " ";
		}
		answer = answer.trim();
		System.out.println(answer);
	}

}
