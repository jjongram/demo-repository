package kr.co.demo;

public class Exam01 {

	public static void main(String[] args) {
		// 1. 문자열 변수 name 에 자신의 이름 저장
		
		// 2. 정수 변수 age 에 자신의 나이를 저장
		
		// 3. 실수 변수 tall 에 자신의 키를 저장
		
		// 4. 변수에 저장된 모든 값을 .println() 메서드를 사용하여 출력
		
		// 5. 변수에 저장된 값을 활용하여 다음 형식에 맞추어 출력
		//    형식에 맞추어 출력할 때 .print() / .printf() / . println() 중
		//    자신이 사용하기 편한 메서드 하나를 선택하여 출력
		//
		//    형식 : 저의 이름은 홍길동 입니다. 올해 30 세이며, 내년에는 31 세가 됩니다.

		
		// 6. 문자열 상수 MALE 과 FEMALE 을 생성하고 각각 "남성", "여성" 로 초기화 하세요.
		
		// 7. 변수와 상수에 저장된 값을 활용하여 다음 형식에 맞추어 출력하세요.
		//
		//    형식 : 저의 키는 175.5 로 대한민국 남성 표준 키보다 조금 큽니다.
		String name = "한종인";
		int age = 28;
		double tall = (double) 175.5;
		System.out.printf("저의 이름은 %s 입니다. 올해 %d 세이며, 내년에는 %d세가 됩니다.\n", name, age, age+1);
		final String MALE = "남성";
		final String FEMALE = "여성";
		System.out.printf("저의 키는 %.1f로 대한민국 %s 표준 키보다 조금 큽니다.", tall, MALE);
//		escape 문자
//		tab				\t			정해진 공간만큼 띄어쓰기
//		new line		\n			출력하고 다음라인으로 옮긺
//		역슬래쉬			\\			특수문자 사용시 \를 넣고
//		작은 따옴표		\'			특수문자를 넣어야 함
//		큰 따옴표			\""
//		유니코드			\u			유니코드 표시할 때 사용
		
	}

}
