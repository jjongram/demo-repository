package kr.co.exam06;

import java.util.Objects;

public class Subject {
	public String sName;
	public double score;
	public char grade;
	
	public Subject(String name) {
		this.sName = name;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score >= 0 && score <= 100) {
			this.score = score;
			} else {
				this.score = 0;
			}
			this.setGrade();

	}

	public char getGrade() {
		return grade;
	}

	public void setGrade() {
		switch((int)(score / 10)) {
		case 10:
		case 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		case 5:
			this.grade = 'E';
			break;
		default:
			this.grade = 'F';
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, sName, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return grade == other.grade && Objects.equals(sName, other.sName)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score);
	}

	@Override
	public String toString() {
		return "Subject [sName=" + sName + ", score=" + score + ", grade=" + grade + "]";
	}
	
	
}
