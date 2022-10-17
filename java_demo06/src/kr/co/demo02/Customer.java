package kr.co.demo02;

public class Customer {
	String name;
	int age;
	String phone;
	String address;
	
	// 기본 생성자
	public Customer() {
		
	}
	
	// 매개변수가 있는 생성자
	public Customer(String name) {
		this.name = name; //생성자
	}
	
	public Customer(String name, int age) {
		this.name = name;//생성자
		this.age = age;//생성자
	}
	
	public void pay() {
		
	}
	public void paycancel() {
		
	}
	public void phoneChange() {
		
	}
}
