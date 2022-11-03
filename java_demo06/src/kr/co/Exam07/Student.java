package kr.co.Exam07;

import java.util.Arrays;

public class Student {
	public Subject subject[] = {new Subject ("수학", 90), new Subject ("국어", 85)};
	public String name;
	public int year;
	/**
	 * 생성자 입니다.
	 * @param subject
	 * @param name
	 * @param year
	 */
	public Student(String name) {   
		this.name = name;
	}
	/**
	 * getAll 메서드 입니다.
	 * 
	 */
	public String getAll() {
		String str = "";
		for(int i = 0; i < this.subject.length; i++) {
			Subject s = this.subject[i];
			str += String.format("%s\t%.0f\t%c\n", s.name, s.score, s.grade);
		}
//		System.out.println(str);
		return str;
		
	}
	/**
	 * 과목추가 메서드 입니다.
	 * @param name
	 * @param score
	 * @param grade
	 */
	public void add(String name, double score) {
		this.subject = Arrays.copyOf(this.subject, this.subject.length + 1);
		this.subject[this.subject.length - 1] = new Subject(name, score);
		String str = Arrays.toString(subject);
		System.out.println(this.subject);
	}
	/**
	 * 과목삭제 메서드 입니다.
	 */
	public void remove(String name) {
		Subject[] tmp = new Subject[this.subject.length-1];
		for(int i = 0, j=0; i < this.subject.length; i++) {
			if(!this.subject[i].name.equals(name)) {
				tmp[j] = this.subject[i];
				j++;
			} 		
		}
		this.subject = tmp;
	}
	/**
	 * 과목점수수정 메서드 입니다.
	 */
	public void changeScore (String name, double score) {
		for(int i = 0; i < this.subject.length; i++) {
			if(this.subject[i].name.equals(name)) {
				this.subject[i].score = score;
			}
		}
	}
}

