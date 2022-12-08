package baekjoon;

import java.util.*;

public class Main11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Map<ArrayList, ArrayList> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split(" ");
			list1.add(Integer.parseInt(arr[0]));
			list2.add(Integer.parseInt(arr[1]));
//			map.put(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		}
		
//		for(int i = 0; i < n; i++) {
//			list1.add(sc.nextInt());
//			list2.add(sc.nextInt());
//		}
		Collections.sort(list1);
		Collections.sort(list2);
		for(int i = 0; i < n; i++) {
			System.out.println(list1.get(i) + " " + list2.get(i));
		}

	}

}
