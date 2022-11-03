package kr.co.exam04;

public class Grade {
	public double score;
	public char grade;
	
	public Grade(double score, char grade) {
		this.score = score;
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		// A ~ F 등급 계산 메서드
	}
	
	
}
