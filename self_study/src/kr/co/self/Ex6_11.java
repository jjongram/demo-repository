package kr.co.self;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) {
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		Collection list = new ArrayList<>();
		list.add(123);
		list.add(122);
		list.add(121);
		list.add(127);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = String.valueOf(it.next());
			System.out.println(obj+"asdf");
		}
	}
}
