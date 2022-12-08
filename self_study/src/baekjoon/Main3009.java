package baekjoon;

import java.util.*;

public class Main3009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i < 3; i++) {
			String[] str = new String[2];
			str = sc.nextLine().split(" ");
			list1.add(Integer.parseInt(str[0]));
			list2.add(Integer.parseInt(str[1]));
		}
		
		Set<Integer> setx = new HashSet<>(list1); 
		Set<Integer> sety = new HashSet<>(list2); 

		List<Integer> listx = new ArrayList<>(setx);
		int x = (listx.get(0) + listx.get(1))*2;
		
		List<Integer> listy = new ArrayList<>(sety);
		int y = (listy.get(0) + listy.get(1))*2;

		int sum1= 0;
		for(int i = 0; i < 3; i++) {
			sum1 += list1.get(i);
		}
		
		int sum2= 0;
		for(int i = 0; i < 3; i++) {
			sum2 += list2.get(i);
		}
		System.out.printf("%d %d", x-sum1, y-sum2);
	}

}
