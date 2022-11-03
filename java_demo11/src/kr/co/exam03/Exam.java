package kr.co.exam03;

import java.util.HashMap;
import java.util.Map;

public class Exam {

	public static void main(String[] args) {
		/*
		 * 과목 정보를 담기위한 HashMap 컬렉션을 사용해 보세요.
		 * 다음의 과목명과 과목 점수가 HashMap 에 저장될 수 있게 하세요.
		 * 
		 * 과목명 : 국어, 영어, 수학, 과학, 사회, 체육, 미술
		 * 
		 * 과목명은 Key 가 됩니다.
		 * 과목 점수는 Value 가 되며, Double 형으로 임의의 정수를 저장하세요.
		 * 
		 * 모든 정보를 입력 후에는 평균과 총점을 구해서 출력하세요.
		 */

		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("국어", 89.4);
		map.put("영어", 49.4);
		map.put("수학", 59.4);
		map.put("과학", 69.4);
		map.put("사회", 29.4);
		map.put("체육", 79.4);
		map.put("미술", 100.0);
		
		double total = 0;
		 for (Map.Entry<String, Double> entry : map.entrySet()) {
	            System.out.println(entry.getValue());
	            total += entry.getValue();
	        }
		 System.out.printf("총점 : %.2f", total);
		 System.out.println();
		 System.out.printf("평균 : %.2f", total/map.size());
		 System.out.println();

	}

}
