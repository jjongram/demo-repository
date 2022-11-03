package kr.co.exam05;

public class Score {
	public double score;
	public char grade;
	
	public Score(double score) {
		this.score = score;
		setGrade();
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

	public void setGrade() {
		System.out.println("등급 출력");
	}
}
