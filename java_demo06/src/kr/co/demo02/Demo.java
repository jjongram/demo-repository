package kr.co.demo02;

public class Demo {
	public static void main(String[] args) {
		/*
		 * 생성자
		 * 		new 연산자를 통해 클래스를 인스턴스로 만들떄
		 * 		초기값을 전달하여 멤버 변수에 설정하는 메서드
		 * 
		 * - 생성자는 클래스 이름과 동일해야 한다.
		 * - 생성자는 메서드와 유사하나 반환값이 없다.
		 * - 생성자를 정의하지 않으면 기본 생성자가 자동으로 구현되어 사용된다.
		 * - 생성자를 정의하면 기본 생성자가 자동으로 구현이 안 되어 사용할 수
		 * 없게 된다.
		 */
		Customer cs = new Customer();
		System.out.println(cs);
		
		Customer cs1 = new Customer("홍길동");
		System.out.println(cs1.name);
		System.out.println(cs1.age);
		
		Customer cs2 = new Customer("박종화", 32);
		System.out.println(cs2.name);
		System.out.println(cs2.age);

	}
}
