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
	public String name;
	public int score;
	public char grade;
	
	public Subject(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		if(0 <= score && score <= 100) {
			this.score = score;
		} else {
			System.out.println("0~100 사이의 값을 입력하시오");
		} setGrade();
	}
	public void setGrade() {
		switch (score/10) {
			case 10 :
			case 9 :
				this.grade = 'A';
				break;
			case 8 :
				this.grade = 'B';
				break;
			case 7 :
				this.grade = 'C';
				break;
			case 6 :
				this.grade = 'D';
				break;
			case 5 :
				this.grade = 'F';
				break;
			default :
				this.grade = 'ㅗ';
		}
	}
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public char getGrade() {
		return grade;
	}
}
