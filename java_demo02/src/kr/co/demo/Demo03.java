package kr.co.demo;

public class Demo03 {

	public static void main(String[] args) {
		// 형변환 : 변수에 저장된 특정 자료형의 데이터를 다른 자료형의 변수에 저장하기
		//		  위해 자료형의 종류를 변환시켜주는 작업을 형변환이라고 하며, 캐스팅(Casting)
		//		  이라고 한다.
		
		// 형변환은 일반적으로 다음의 경우에 필요하다.
		// 정수 -> 정수 / 정수 -> 실수 / 실수 -> 정수/ 실수 -> 실수
		
		// 자료형의 크기가 작은 자료형에서 큰 자료형으로 변환을 할 때 -> 자동 형변환
		
		// 자료형의 크기가 큰 자료형에서 작은 자료형으로 변환을 할 때 -> 강제 형변환
		byte bt1;
		short st1 = 500;
		
		bt1 = (byte) st1; //Casting
		
		double it1 = 10 + 10.5;
		System.out.println(it1);
		
		String str1 = "문자열";
		str1 = str1 + 10;
		System.out.println(str1); //문자열에서 연산하면 결합된 문자열이 나옴
		
		String str2 = "문자열";
		str2 = 20 + str2;
		System.out.println(str2); //문자열에서 연산하면 결합된 문자열이 나

	}

}
