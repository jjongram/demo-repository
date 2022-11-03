package kr.co.exam01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


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

//	    boolean isExists = aList.contains(rd.nextInt(45)+1);
	    while(aList.size()<6) {
	    	int num = rd.nextInt(45)+1;
	    	if(!aList.contains(num)) {
	    		aList.add(num);
	    	 }
	     }

	    Collections.sort(aList);
	    System.out.println(aList);
	}

}
