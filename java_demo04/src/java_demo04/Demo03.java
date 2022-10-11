package java_demo04;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * switch 문
		 * 		if문과 비슷하게 조건에 따라 특정 코드가 실행
		 * 		되도록 하는 문장
		 * 
		 * 		if문의 경우에는 크기 비교 연산등을 활용하여 특정
		 *		값의 범위에 해당하는 경우를 선택할 수 있으나
		 *		switch 문의 경우 연산 결과에 해당하는 값인
		 *		경우에만 선택적으로 실행되게 할 수 있다.
		 *
		 *switch(연산식) {
		 *		case 값1:
		 *			실행 코드;
		 *			break;
		 *		case 값2:
		 *			실행 코드;
		 *			break;
		 *		case 값3:
		 *			실행 코드;
		 *			break;
		 *		default: 
		 *			실행 코드;
		 *}
		 *
		 *switch 문에서 default 는 생략 가능하며, case 에 해당하지
		 *않는 값이 계산된 경우 실행된다.
		 *
		 *switch 문의 각 case 안에는 break 구문을 사용하여 더 이상
		 *switch 문이 동작하지 않고 종료되도록 만들어야 하며, 그렇지
		 *않은 경우, 특정 case 에 해당하여 실행한 이후 나머지 case 가
		 *전부 동작한다.
		 */
		
		int value = 1;
		
		switch(value) {
			case 1:
				System.out.println("case 1 에 해당되어 동작");
				break;
			case 2:
				System.out.println("case 2 에 해당되어 동작");
				break;
			case 3:
				System.out.println("case 3 에 해당되어 동작");
				break;
			default:
				System.out.println("어떠한 case 에도 해당되지 않아 동작");
		}
		
		String str = "2";
		
		switch(str) {
			case "1" :
				System.out.println("스위치문에서 문자열 비교는 자동으로 값에 대한 비교를 수행 -> 1");
				break;
			case "2" :
				System.out.println("스위치문에서 문자열 비교는 자동으로 값에 대한 비교를 수행 -> 2");
				break;
			case "3" :
				System.out.println("스위치문에서 문자열 비교는 자동으로 값에 대한 비교를 수행 -> 3");
				break;
			default:
				System.out.println("어떠한 case 에도 해당되지 않아 동작");
		}
	}

}
