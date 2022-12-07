package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 특정문자제거하기 {

	public static void main(String[] args) {
String my_string = "VVVVBBBB";
		
		String letter = "V";
		
		String[] arr = my_string.split("");
//		System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<String>();
		
		list = new ArrayList<String>(Arrays.asList(arr));
			
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.size());
			if(list.get(i).equals(letter)) {
				list.remove(i);
				--i;
			}
		}
		
		String answer = "";
		
		for(int i = 0; i<list.size();i++) {
			answer += list.get(i);
		}

		System.out.println(answer);
	}

}
