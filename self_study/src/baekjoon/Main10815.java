package baekjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet set1 = new HashSet();
		for(int i = 0; i < n; i++) {
			set1.add(sc.nextInt()); 
		}
		
		ArrayList set2 = new ArrayList();
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			if(set1.contains(sc.nextInt())) {
				set2.add(1);
			} else {
				set2.add(0);
			}
		}
		System.out.println(set2.toString().replace("[", "").replace("]", "").replace(",", ""));
	}

}
