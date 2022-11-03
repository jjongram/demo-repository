package kr.co.exam05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 컬렉션에 다른 컬렉션을 담아서 사용하기
		 * ArrayList 에 과목정보들이 있는 HashMap 컬렉션을 담아서 사용해보세요.
		 * 
		 * HashMap 에는 다음의 과목명과 과목 점수가 저장될 수 있게 하세요.
		 * 
		 * 과목명 : 국어, 영어, 수학, 과학, 사회, 체육, 미술
		 * 
		 * 과목명은 Key 가 됩니다.
		 * 과목 점수는 Value 가 되며, Score 객체로 임의의 점수와 등급이 저장되게 합니다.
		 * 
		 * 총 5개의 HashMap 을 ArrayList 에 담아 놓고 ArrayList에 있는 HashMap 별로
		 * 평균과 총점을 구해서 출력하세요.
		 */
		
		HashSet<String> subjects = new HashSet<String>();
		subjects.add("국어"); subjects.add("영어");
		subjects.add("수학"); subjects.add("과학");
		subjects.add("사회"); subjects.add("체육");
		subjects.add("미술");
		
		ArrayList<HashMap<String, Score>> datas2 = new ArrayList<HashMap<String, Score>>();
	
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			HashMap<String ,Score> datas1 = new HashMap<String, Score>();
			for(String subject: subjects) {
				double score = Double.valueOf(rand.nextInt(40) * rand.nextDouble() + 60);
				datas1.put(subject, new Score(score));
			}
			datas2.add(datas1);
		}
//		System.out.println(datas1);
		
		double sum = 0;
		double avg = 0;
		for(Score s: datas1.values()) {
			sum += s.getScore();
		}
		avg = sum / datas1.size();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		datas2.add(datas1); datas2.add(datas1);
		datas2.add(datas1); datas2.add(datas1);
		datas2.add(datas1);
		System.out.println(datas2.get(0));
		
	}

}
