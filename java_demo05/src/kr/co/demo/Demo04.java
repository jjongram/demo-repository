package kr.co.demo;

import java.util.Random;//random class

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * Random 클래스
		 */
		Random rand = new Random();//random class
		
		int num = rand.nextInt(5);//5미만에 해당하는 난수 생성
		
		System.out.println(num);//출력
	}

}
