package kr.co.demo03;

import kr.co.demo03.customer.*;

public class Demo {

		public static void main(String[] args) {
			/*
			 * 접근제한자
			 * 		public : 모든 영역에서 접근 가능함
			 * 		protected : 동일 패키지 또는 후손 관계 까지만 접근 가능
			 * 		(default) : 동일 패키지 까지만 접근 가능, 명시하지 않는다.
			 * 		private : 해당 클래스 내부에서만 접근 가능
			 * 
			 * 클래스 접근제한자
			 * 		public, default
			 * 
			 * 멤버 변수
			 * 		public, protected, default, private
			 * 
			 * 멤버 메서드
			 * 		public, protected, default, private
			 */
			Customer1 cs1 = new Customer1();
			cs1.name= "홍길동";
			cs1.age = 32;
			//cs1.phone = "010-1234-5678";
			
			Customer2 cs2 = new Customer2();
			cs1.name= "홍길동";
			cs1.age = 32;
			//cs1.phone = "010-1234-5678";
			
			/*
			 * 캡슐화 : 객체를 외부에서 접근하지 못하게 캡슐처럼 감싸서 보호하는 것
			 * 			객체지향 언어의 3대 특징 중 하나(캡슐화, 상속, 다형성)
			 * 
			 * 캡슐화를 위한 기본 원칙
			 * 		- 클래스 멤버 변수에 대한 접근제한은 private 로 한다.
			 * 		- 클래스 멤버 변수에 대한 연산처리를 목적으로 하는 메서드는
			 * 		클래스 내부에 작성한다.(멤버 메서드)
			 * 		-멤버 메서드는 클래스 밖에서 접근할 수 있도록 public 으로
			 * 		설정한다.(멤버 변수에 대한 직접 접근은 안 되지만 메서드를 통한
			 * 		간접 접근은 허용)
			 * 
			 * 캠슐화 이점
			 * 		외부 프로그램이 특정 객체의 멤버 변수에 접근하여 임의로 값을
			 * 		변경하지 못하게 만들어 프로그램의 보안 및 안정성을 높여줄 수
			 * 		있다.
			 */
			
		}
		
}
