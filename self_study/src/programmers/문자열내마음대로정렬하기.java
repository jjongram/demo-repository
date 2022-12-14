package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 문자열내마음대로정렬하기 {
	
    public static void main(String[] args) {
    	String[] strings = {"abcd", "abce", "cdx"};
    	int n = 1;
    	String[] answer = new String[strings.length];
    	HashMap<String, Character> map = new HashMap<>();
    	for(int i = 0; i < strings.length; i++) {
    		map.put(strings[i], strings[i].charAt(n));
    	}
    	System.out.println(map);
//    	System.out.println(map.keySet());
    	List<Character> list = new ArrayList<>();
    	for(int i = 0; i < strings.length; i++) {
    		list.add(map.get(strings[i]));
    	}
    	System.out.println(map.get(strings[0]));
    	Collections.sort(list);
    	System.out.println(list);
    	for(int i = 0; i < list.size(); i++) {
    		for(int j = 0; j < strings.length; j++) {
    			if(list.get(i).equals(map.get(strings[j]))) {
    				answer[i] = strings[j];
    				map.remove(strings[j]);
    			}
    		}
    	}
    	System.out.println(Arrays.toString(answer));
    }
}
