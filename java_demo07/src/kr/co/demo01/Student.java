package kr.co.demo01;

public class Student extends Person {
	private int year;
	private int classRoom;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	/*
	 * 메서드 오버라이드
	 * 		기존 부모 클래스가 가지고 있는 메서드를 자식에서
	 * 		재정의하여 사용하는 것
	 * 
	 * 		기존 부모에 정의한 메서드명, 매개변수 타입/수,
	 *		반환타입이 동일해야 한다.
	 *		
	 *		메서드 오버라이드 대상에는 반드시 @Override
	 *		어노테이션을 메서드 명 위에 작성하도록 한다.
	 *		(필수는 아니지만 메서드명에 대한 오타를 확인할
	 *		수 있다.)
	 *
	 *		접근제한자는 부모의 접근제한자 보다 같거나 넓은
	 *		범위로 작성해야 한다.
	 *
	 *		예외처리 부모 보다 같거나 좁은 범위 또는 적은 수의
	 *		예외처리여야 한다.
	 *
	 *		final 키워드가 사용된 메서드에 대해서는 오버라이드를
	 *		할 수 없다.
	 */
	
	
}
