package kr.co.demo04;

public class Demo {

	public static void main(String[] args) {
		Customer cs = new Customer("홍길동", 32, "010-1234-5678");
		
		System.out.println("이름 : " + cs.getName());
		System.out.println("나이 : " + cs.getAge() + " 대");
		System.out.println("연락처 : " + cs.getPhone());

	}

}
