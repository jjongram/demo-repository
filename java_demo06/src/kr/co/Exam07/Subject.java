package kr.co.Exam07;

public class Subject {
	public String name;
	public double score;
	public char grade;
	/**
	 * 생성자 입니다.
	 * @param name
	 */
	public Subject(String name, double score) {
		this.name = name;
		this.score = score;
	}
	/**
	 * name값 확인 메서드
	 * @return
	 */
	public String print() {
		return name;
	}
	
	public double getScore(double score) {
		return score%100;
	}
	/**
	 * 점수로 등급을 산출하기 위한 메서드 입니다.
	 * @param score
	 * @return 
	 */
	public char getGrade(double score) {
		switch ((int)score/10) {
			case 10 :
			case 9 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			case 6 : grade = 'D';
				break;
			case 5 : grade = 'F';
				break;
			default :
		}
//		System.out.println(grade);
		return grade;
	}
	 
}
