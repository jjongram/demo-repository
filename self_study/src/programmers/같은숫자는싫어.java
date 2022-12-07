package programmers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		Collection c = new HashSet<>();
		final int SIZE = c.size();
		for(int i = 0; i < arr.length; i++) {
			c.add(arr[i]);
		}
		int[] answer = new int[c.size()];
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
