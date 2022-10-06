package kr.co.demo;

public class Demo04 {

	public static void main(String[] args) {
		// 출력 : System.out.print() 메서드로 변수에 저장된 데이터를
		// 		 터미널에 출력하기 위해 사용한다.
		//  	 출력 메서드는 .print() 외에 .print() / .println() 이 있다.
		
		// .print() : 개행(줄바꿈) 없이 한 줄에 계속 출력할 떄 사용
		// .printf() : .print() 와 동일한 기능 + 출력 형식(포멧) 지정하여 출력할 때 사용
		// .println() : .print() 와 동일한 기능 + 마지막에 개행(줄바꿈)을 한다.
		
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		
		System.out.println();
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		System.out.printf("%s / %d", "ABCD", 1234);
		
		System.out.println();
		
		String name = "홍길동";
		int age = 30;
		System.out.println("당신의 이름은 " + name + " 입니다. 나이는 " + age +"세 입니다.");
		System.out.printf("당신의 이름은 %s 입니다. 나이는 %d세 입니다.", name, age);
	}

}
