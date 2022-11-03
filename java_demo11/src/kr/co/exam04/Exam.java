package kr.co.exam04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 과목 정보를 담기위한 HashMap 컬렉션을 사용해 보세요.
		 * 다음의 과목명과 과목 점수가 HashMap 에 저장될 수 있게 하세요.
		 * 
		 * 과목명 : 국어, 영어, 수학, 과학, 사회, 체육, 미술
		 * 
		 * 과목명은 Key 가 됩니다.
		 * 과목 점수는 Value 가 되며, Score 객체로 임의의 점수와 등급이 저장되게 합니다.
		 * 
		 * 모든 정보를 입력 후에는 평균과 총점을 구해서 출력하세요.
		 */
		HashSet<String> subjects = new HashSet<String>();
		subjects.add("국어"); subjects.add("영어");
		subjects.add("수학"); subjects.add("과학");
		subjects.add("사회"); subjects.add("체육");
		subjects.add("미술");
		
		HashMap<String, Score> datas = new HashMap<String, Score>();
		
		Random rand = new Random();
		for(String subject: subjects) {
			double score = Double.valueOf(rand.nextInt(40) * rand.nextDouble() + 60);
			datas.put(subject, new Score(score));
		}
		
		System.out.println(datas);
		
		double sum = 0;
		double avg = 0;
		for(Score s: datas.values()) {
			sum += s.getScore();
		}
		avg = sum / datas.size();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
