package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people    unFollowed me     ";
		s = s.trim();
		s = s.toLowerCase();
		String[] arr2 = s.split(" ");
		System.out.println(Arrays.toString(arr2));
		List<String> list = new ArrayList<>();
		for(int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(" ")) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		StringBuilder sb = new StringBuilder(s);
		String[] arr = s.split("");
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(" ")) {
				arr[i+1] = arr[i+1].toUpperCase();
			}
		}
		System.out.println(sb);
		System.out.println(Arrays.toString(arr));
	}

}
