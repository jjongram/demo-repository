package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1269 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}
		List<Integer> tmp = new ArrayList<>();
		tmp = (List<Integer>) ((ArrayList) list1).clone();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			list.add(sc.nextInt());
		}

		list1.removeAll(list);
		list.removeAll(tmp);
		System.out.println(list1.size()+list.size());

	}

}
