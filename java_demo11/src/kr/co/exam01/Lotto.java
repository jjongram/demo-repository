package kr.co.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
	Lotto(){
		
	}
	
	public static ArrayList<Integer> getLotto() {
		 Random rd = new Random();
	     ArrayList<Integer> aList = new ArrayList<Integer>();

	     boolean isExists = aList.contains(rd.nextInt(45)+1);
	     while(aList.size()<6) {
	    	 if(!isExists) {
	    	 aList.add((rd.nextInt(45)+1));
	    	 }
	     }

	     Collections.sort(aList);
	     return aList;

	}
	

}
