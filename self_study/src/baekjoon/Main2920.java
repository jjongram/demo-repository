package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();


		for(int i = 0; i < 8; i++) {
			int a = sc.nextInt();
			list1.add(a);//ascending
			list2.add(a);//descending
			list3.add(a);//original

		}
		Collections.sort(list1);//ascending
		
		Collections.sort(list2);
		Collections.reverse(list2);//descending
		
		if(list1.equals(list3)) {
			System.out.println("ascending");
		} else if(list2.equals(list3)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}

}
