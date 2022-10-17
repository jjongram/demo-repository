package kr.co.Exam02;

public class ExamT {
	public static void main(String[] args) {
		/*
		 * 과목(Subject) 클래스를 만들어 본다.
		 * 과목 클래스는 다음의 속성 및 기능을 가진다.
		 * 		속성 : 과목명, 점수, 등급
		 * 		기능 : 점수등록
		 * 
		 * 과목명은 한 번 정해지면 변경할 수 없어야 한다.
		 * 점수는 언제든 변경할 수 있으나 0~100 사이의 값만 저장해야 한다.
		 * 등급은 점수에 의해 결정되며, A~F 등급까지 부여한다.
		 * 과목 객체의 속성값을 확인하는 것은 허용한다.
		 */

		SubjectT s1 = new Subject("국어");
		s1.setScore(86.5);
		
		System.out.println("과목명 : " + s1.getName());
	}

}
