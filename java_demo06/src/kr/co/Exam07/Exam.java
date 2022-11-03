package kr.co.Exam07;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 학생들의 성적을 관리하기 위한 용도의 클래스를 생성하세요.
		 * 		학생 클래스
		 * 			멤버변수 : 과목클래스배열, 이름, 학년
		 * 			멤버메서드 : 과목추가, 과목점수수정, 과목삭제, 성적표출력
		 * 
		 * 		과목 클래스
		 * 			멤버변수 : 과목명, 점수, 등급
		 * 			멤버메서드 : 점수로 등급을 산출하기 위한 메서드
		 * 
		 * 학생 성적을 관리하기 위해서 추가적으로 필요한 멤버변수/멤버메서드가 있으면
		 * 더 작성하세요.
		 */
		Student st1 = new Student("스티브잡스");
		System.out.println(st1.getAll());
		
		System.out.println("과목추가");
		st1.add("한자", 85);
		st1.add("과학", 55);
		st1.add("영어", 100);
		st1.add("체육", 95);
		
		System.out.println(st1.getAll());
		
		System.out.println("과목삭제");
		st1.remove("한자");
		System.out.println(st1.getAll());
		
		st1.changeScore("과학", 90);
		System.out.println(st1.getAll());
		System.out.println(st1.name);

		Subject sb1 = new Subject("코딩", 25);
		System.out.println(sb1.getGrade(0));

//		Subject sb = new Subject("수학", 100);
		
//		System.out.println(sb.print());
		
//		sb.setGrade(99);
		
//		Student st = new Student("종인");
//		st.add("과학", 25);
//		System.out.println(st.name);
//		System.out.println(st.getAll());
		/*
		 * 과학 지우기 테스트
		 */
//		st.remove("과학");
//		System.out.println(st.getAll());
		/*
		 * 과학 점수 변경 테스트
		 */
//		st.changeScore("과학", 5);
//		System.out.println(st.getAll());
	}
}
