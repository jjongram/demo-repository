package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		List<Integer> list = new ArrayList<>();
		Map<Integer, Double> map = new HashMap<>();
		for(int i = 0; i < stages.length; i++) {
			list.add(stages[i]);
		}
		System.out.println(list);
		int size = list.size();
		for(int i = 1; i <= N; i++) {
			int cnt = 0;
			for(int j = 0; j < list.size(); j++) {
				if(i==list.get(j)) {
					cnt++;
				}
			}
//			System.out.println(cnt);
//			System.out.println(size);
			map.put(i, (double)cnt/size);
			size -= cnt;
		}
		System.out.println(map);
		System.out.println(map.keySet());

		for(int i = 0; i < map.size(); i++) {
			
		}
	}

}
