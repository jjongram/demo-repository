package kr.co.Exam02;
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

public class Subject {
	private String name;
	private int score;
	private String grade;
	
	public Subject(String name, int score, String grade) {
		this.name = name;
		this.score = score;
		this.grade = grade;
	}
	public void changeScore(int score, String grade) {//점수등록
		this.score = score;
		this.grade = grade;
	}
	
	public String getName() {//과목확인
		return this.name;
	}
	public int getScore() {//점수확인
		return this.score;
	}
	public String getGrade() {//등급확인
		return this.grade;
	}
}
