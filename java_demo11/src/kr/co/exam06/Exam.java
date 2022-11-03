package kr.co.exam06;

import java.util.HashMap;
import java.util.HashSet;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 학생들의 성적을 관리하기 위한 프로그램으로 컬렉션과 파일 입출력을 활용하여 만들어 보세요.
		 * 
		 * Student 클래스에는 학생의 정보를 담기 위한 클래스로 사용하세요.
		 * 		멤버 필드 : 이름, 학년, 반, 번호
		 * 		멤버 메서드 :  Getter/Setter 생성, HashCode(), equals() 생성
		 * 					toString() 생성
		 * 
		 * Subject 클래스에는 과목 정보를 담기 위한 클래스로 사용하세요.
		 * 		멤버 필드 : 과목명, 점수, 등급
		 * 		멤버 메서드 : Getter/Setter 생성, hashCode(), equals() 생성
		 * 					toString() 생성
		 * 
		 * HashMap 을 기본으로 Key 에는 Student 클래스를 사용하고 Value 에는 ArrayList
		 * 를 사용하도록 한다.
		 * ArrayList에는 Subject 클래스를 담아 사용하도록 한다.
		 * 
		 * 성적 관리 프로그램으로 관리하는 모든 정보는 파일에 저장되어야 하며 다음번에 다시
		 * 프로그램을 실행 했을 때 이전 상태가 저장되어 있어야 한다.
		 * 파일명은 "학생성적관리정보.info" 로 한다.
		 */
		HashSet<String> student = new HashSet<String>();
		student.add("Sean"); student.add("Victoria");
		student.add("Holland");
		
		HashMap<Student, Subject> datas = new HashMap<Student, Subject>();


	}

}
