package kr.co.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rd = new Random();
	     ArrayList<Integer> aList = new ArrayList<Integer>();

	     boolean isExists = aList.contains(rd.nextInt(45)+1);
	     while(aList.size()<6) {
//	    	 for(int i = 0; i<aList.size(); i++) {
//	    	 }
	    	 if(!isExists) {
	    	 aList.add((rd.nextInt(45)+1));
	    	 }
	     }

	     Collections.sort(aList);
	     System.out.println(aList);
	}

}
