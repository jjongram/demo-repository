package kr.co.demo04;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 추상(abstract) 클래스
		 * 		- 미완성 클래스로 클래스 안의 메서드가 전부 구현되어 있지 않는 클래스
		 * 		- 클래스 안의 메서드는 추상 메서드로 선언부만 있고 구현부(몸체)는 없는
		 * 		  메서드가 0개 이상 존재하게 된다.
		 * 		- abstract 키워드를 사용하여 생성
		 * 		- 추상 클래스로는 객체를 생성할 수 없다.
		 * 		- 참조 타입으로는 사용가능하다. -> 다형성에 적용해서 사용 가능
		 * 		- 추상 클래스를 상속하는 일반 클래스는 추상 메서드에 대해서 반드시 구현을
		 * 		  해야하는 강제성을 가지고 있다.
		 * 
		 * 추상 클래스는 상속하는 자식 클래스들은 일관된 메서드명을 가질 수 있으며,
		 * 일관된 이름을 가지고 다형성에 적용하여 사용할 수 있게 된다.
		 */
		Person p = new Customer();
		p.setName("홍길동");
		
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
	}

}
