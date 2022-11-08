package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		for(int i = 0; i < 5; i++) {
			sum += list.get(i);
		}
		Collections.sort(list);
		System.out.println(sum/5);
		System.out.println(list.get(2));

	}

}
