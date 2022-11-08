package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Main1269again {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashSet<Integer> set1 = new HashSet();
		HashSet<Integer> set2 = new HashSet();
		HashSet<Integer> tmp = new HashSet();


		for(int i = 0; i < n; i++) {
			set1.add(sc.nextInt());
		}
		for(int i = 0; i < m; i++) {
			set2.add(sc.nextInt());
		}
		tmp = (HashSet<Integer>) ((HashSet) set1).clone();
		
		set1.removeAll(set2);
		
		set2.removeAll(tmp);
		System.out.println(set1.size()+set2.size());
	}

}
