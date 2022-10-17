package kr.co.demo01;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 객체
		 * 		현실 세계에서는 사물이나 개념처럼 독립되고 구분되는
		 * 		각각의 객체로 이루어져 있으며, 발생하는 모든 사건들은
		 * 		객체간의 상호작용으로 이루어져 있다. 이러한 개념을
		 * 		컴퓨터로 옮겨 유사하게 동작하도록 만들것을 객체지향 언어
		 * 		라고 한다.
		 * 
		 * 예시
		 * 		고객 정보를 관리하는 프로그램을 만들려고 할 때 프로그램에서
		 * 		요구하는 "고객" 이라는 객체는 현실 세계의 "고객"을 추상화(객체화)
		 * 		하여 사용하게 된다.
		 * 
		 * 		현실 세계의 고객
		 * 			특징(속성) : 이름, 나이, 성별, 전화번호, 주소, ...
		 * 			기능(메서드) : 결제, 결제취소, 전화번호 변경,
		 * 
		 * 		프로그램에서의 고객 객체
		 * 			고개 객체
		 * 				String 이름;
		 * 				int 나이;
		 * 				String 전화번호;
		 * 				String 주소;
		 * 				...
		 * 
		 * 				public void 결제() {...}
		 * 				public void 결제취소() {...}
		 * 				public void 전화번호변경() {...}
		 * 				...
		 */
		
		// 인스턴스 화 : new 연산자를 사용하여 클래스를 인스턴스로 만드는 것
		Customer cs1 = new Customer(), cs2 = new Customer();
		
		cs1.name = "한종인";
		cs1.age = 28;
		cs1.phone = "010-2429-6697";
		cs1.address = "용인시 수지구...";
		
		System.out.println(cs1.name);
		System.out.println(cs1.age);;
		System.out.println(cs1.phone);;
		System.out.println(cs1.address);;
		
		// 멤버 메서드 사용(메서드 호출)
		cs1.pay();
		cs1.paycancel();
		cs1.phoneChange();
	}

}
