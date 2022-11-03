package com.kr.test;

public class Overloading {
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	public void test(String s, double d) {}//타입이 같아서
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
	private void test(int i, double d) {}//6번 줄이랑 타입이 같아서
	public int test(double j) {return 0;}
}
