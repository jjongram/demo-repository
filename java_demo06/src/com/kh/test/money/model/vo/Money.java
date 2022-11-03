package com.kh.test.money.model.vo;

public class Money {
		public static final String UNIT = "원";
		private int money;//private로 바뀌어야함
	
	//constructor
	public void money(int money) {//반환타입 void 추가
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public static String getUnit() {
		return UNIT;
	}
	
	public void print() {
		System.out.println(money + UNIT + "이 있습니다.");
	}
}
