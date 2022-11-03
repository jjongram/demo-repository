package kr.co.demo03;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 다형성
		 * 		- 객체지향 프로그램 언어의 3가지 특징(캡슐화, 상속, 다형성) 중 하나
		 * 		- 하나의 객체가 여러 형태를 가지는 객체로 사용할 수 있음을 의미
		 * 		- 상속을 사용하여 부모 타입으로 부터 파생된 여러 타입의 자식 객체를
		 * 		  부모 클래스로 다룰 수 있게 된다.
		 * 		- 부모 클래스가 상속한 멤버필드/메서드에 대해서만 다룰수 있다.
		 * 		  자식 클래스에 개별적으로 작성된 필드/메서드는 사용할 수 없다.
		 * 		
		 */
//		자료형 변수명 = 리터럴값;
//		
//		객체타입 변수명 = new 객체타입();
//		
//		부모객체타입 변수명 = new 자식객체타입();
		Person p1 = new Customer();
		Person p2 = new VipCustomer();
		
		p1.setName("홍길동");
		p1.setAge(23);
		p1.setGender('M');

		p2.setName("박주우");
		p2.setAge(25);
		p2.setGender('M');
		
		System.out.println(p1);
		System.out.println(p2);
		/*
		 * 다운 캐스팅
		 * 		- 부모 객체로 사용하고 있는 인스턴스를 자식 객체로 변환하는 것
		 * 		- 명시적으로 작성하여 캐스팅이 이루어지게 한다.(캐스팅 연산 사용)
		 * 업 캐스팅
		 * 		- 자식 객체로 사용하고 있는 인스턴스를 부모 객체로 변환하는 것
		 * 		- 자동으로 변환이 이루어진다.
		 */		
		Customer c1 = (Customer)p1;
		VipCustomer v1 = (VipCustomer)p2;
		
		c1.setDiscount(0.05);
		v1.setDiscount(0.15);
		System.out.println(c1.getDiscount());
		System.out.println(v1.getDiscount());
		System.out.println(v1.getPoint());
		
		System.out.println(p1);
		System.out.println(p2);
		
		/*
		 * 배열에 다형성을 적용하여 서로 다른 자식 객체를 담아 사용할 수 있다.
		 */
		Person pArr[] = new Person[4];
		pArr[0] = new Customer();
		pArr[1] = new VipCustomer();
		pArr[2] = new VipCustomer();
		pArr[3] = new Customer();

		pArr[0].setName("홍길동");
		pArr[1].setName("이장혁");
		pArr[2].setName("박종후");
		pArr[3].setName("한종인");
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof VipCustomer ) {
				VipCustomer vip = (VipCustomer)pArr[i];
				System.out.println(vip.getName() + "|" + vip.getPoint());
			}
		}

	}

}
