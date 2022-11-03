package kr.co.exam01.exam02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Exam {
	public static void main(String[] args) {
		/*
		 * 로또 번호 생성
		 * 		- 1~45 까지의 랜덤 번호를 생성하여 리스트에 담는다.
		 * 		- 중복된 번호 없이 리스트에 담기도록 한다.
		 * 		- 총 6개의 번호가 리스트에 저장되야 한다.
		 * 		- 마지막에 출력 할 때는 오름차순으로 정렬하여 출력되도록 한다.
		 */
		Random rd = new Random();
	    ArrayList<Integer> aList = new ArrayList<Integer>();
		Set<Integer> aSet = new HashSet<Integer>(aList);
//		System.out.println(aSet);


//	    boolean isExists = aList.contains(rd.nextInt(45)+1);
	    while(aSet.size()<6) {
	    	int num = rd.nextInt(45)+1;
	    	if(!aSet.contains(num)) {
	    		aSet.add(num);
	    	 }
	     }

//	    Collections.sort(aSet);
	    System.out.println(aSet);
	}

}
