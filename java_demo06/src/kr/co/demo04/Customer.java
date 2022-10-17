package kr.co.demo04;

public class Customer {
	private String name;
	private int age;
	private String phone;
	
	public Customer(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		
	}
	/*
	 *  getter : 멤버 변수에 저장된 데이터를 반환하는 메서드
	 *  	접근제한자 반환타입 get멤버변수명() { } 형식으로 사용
	 *  
	 *  setter : 멤버 변수에 데이터를 저장하기 위해 사용하는 메서드
	 *  	접근제한자 void set 멤버변수명(자료형 매개변수명) { } 형식으로 사용
	 *  
	 */
	public String getName() {
		return this.name.substring(0, 1) + "XX";
	}
	
	public int getAge() {
		return this.age / 10 * 10;
	}
	
	public String getPhone() {
		return this.phone.substring(0, 9) + "XXXX";
	}
	
	/*
	 * 멤버 메서드(함수)
	 * 		접근제한자 반환타입 메서드명([자료형, 매개변수명, ...]) {
	 * 			메서드 로직;
	 * 			return 반환값;
	 * 		}
	 * 
	 * - "자료형 매개변수명"은 없을 수도 있다.
	 * - 반환값은 반드시 메서드에 명시한 반환타입과 일치해야 한다.
	 * - 반환타입이 void 인 경우 return 은 생략될 수 있다. 그 외에는
	 *   반드시 있어야 한다.
	 * - 메서드는 return 구문을 실행하거나 함수의 끝까지 이동하면 함수의
	 *   실행이 종료된다. return 구문에 있는 값을 메서드를 호출한 위치로
	 *   반환 후에 종료된다.
	 *   
	 */
}
