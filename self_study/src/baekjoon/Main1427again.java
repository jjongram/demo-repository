package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1427again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] c = new char[str.length()];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
//			c[i] = str.charAt(i);
			list.add((int)str.charAt(i)-48);
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.toString().replace("[", "").replace("]", "").replace(", ", ""));
		
	}

}
