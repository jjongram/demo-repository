package kr.co.demo01;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 상속(Inherit)
		 * 		-	다른 클래스가 가지고 있는 멤버(변수, 메서드)들을
		 * 			새로 작성하는 클래스에서 직접 만들지 않고 상속을
		 * 			받아서 자신의 멤버변수, 멤버메서드 처럼 사용할 수
		 * 			있게 만드는 기능
		 *		-	부모의 private 접근제한자를 사용하는 멤버들은 자식
		 *			이라해도 접근할 수 없다.
		 *		-	생성자는 상속되지 않는다.
		 *		-	extends 키워드로 상속 받을 수 있는 객체는 오직 1개 뿐이다.
		 *			(다중 상속 지원 안 함)
		 *		-	상속 관게에서 객체가 생성될 때 부모가 먼저 생성된 후 자식이
		 *			생성된다.
		 *		-	자식 클래스에서 super 키워드를 사용하면 부모에 대한 접근으로
		 *			사용된다.
		 *	상속의 이점
		 *		-	재사용성이 높아진다.
		 *		-	적은 양의 코드로 새로운 클래스 작성
		 *		-	코드의 중복을 최소화 하고 프로그램의 생산성/유지보수성에 기여함
		 *		-	공통 기능에 대해서는 상속을 통해 관리하기 때문에 관리가 용이해짐.
		 */	
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(23);
		s1.setGender('M');
		s1.setYear(1);
		s1.setClassRoom(5);
		
		System.out.println(s1.getName() + "|" + s1.getAge());
		
		Teacher t1 = new Teacher();
		t1.setName("김철수");
		t1.setAge(35);
		t1.setGender('M');
		t1.setSubject("국어");
		t1.setRole("담임");
		
		System.out.println(t1.getName() + "|" + t1.getAge());

	}

}
