package kr.co.demo01;

public class Demo {

	public static void main(String[] args) {
		/*
		 * String 관련 클래스
		 * 		- String : 문자열 클래스로 문자열 데이터를 다루기 위해 사용한다.
		 * 			수정 불가능(불변타입) 으로 데이터 수정 시 원본 데이터를 복사하여
		 * 			새로운 문자열 데이터로 만드는 형식으로 사용
		 * 
		 * 		- StringBuilder : 문자열 클래스로 String 의 불변타입을 변경가능으로
		 * 			사용할 수 있게 만들어진 클래스이다.
		 * 			Thread Safe 기능을 제공하지 않음.
		 * 
		 * 		- StringBuffer : StringBuilder 클래스와 동일한 기능을 제공
		 * 			Thread Safe 기능을 제공함.
		 * 			Thread Safe 기능은 멀티쓰레드 작업에 활용할 때 공유 자원에 대한
		 * 			안정성을 높여 주기 위해 사용하는 기능
		 */
		String str1 = "문자열";
		String str2 = new String("문자열");
		String str3 = new String(new char[] {'문', '자', '열'});
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//charAt() : 문자열에서 매개변수로 전달한 정수값의 위치에 해당하는 문자를 반환하는 메서드
		for(int i = 0; i < 3; i++) {
			char ch = str1.charAt(i);
			System.out.print(ch);
		}
		char ch = str1.charAt(2);
		System.out.println(ch);
		
		// codePointAt() : 문자열에서 매개변수로 전달한 정수값의 위치에 해당하는 문자의 문자코드를 반환하는 메서드
		for(int i = 0; i < str1.length(); i++) {
			int code = str1.codePointAt(i);
			System.out.println(code + "|" + (char)code);
		}
		
		// compare() :
		str1 = new String("가");
		str2 = new String("나");
		int compare = str1.compareTo(str2);
		System.out.println(compare);
		compare = str2.compareTo(str1);
		System.out.println(compare);
		
		System.out.println(str1.codePointAt(0));
		System.out.println(str2.codePointAt(0));

		// concat() :
		str1 = new String("가");
		str2 = new String("나");
		str3 = str1.concat(str2);
		System.out.println(str3);
		
		// contains() :
		str1 = new String("이 메서드는 contains 메서드 예제 입니다.");
		boolean isContains = str1.contains("contains");
		
		isContains = str1.contains("컨테인");
		System.out.println(isContains);
		
		//
		str1 = new String("동일한 내용이 있는지 검사하는 메서드");
		boolean isEquals = str1.contentEquals("동일한 내용이 있는지 검사하는 메서드");
		System.out.println(isEquals);
		
		isEquals = str1.contentEquals("동일한 내용이 있는지");
		System.out.println(isEquals);
		
		//
		str1 = new String("endWith(), startsWith() 메서드 에제");
		boolean isEnds = str1.endsWith("start");
		boolean isStarts = str1.startsWith("end");
		System.out.println(isEnds + "|" + isStarts);

	}

}
