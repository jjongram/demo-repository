package kr.co.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Set 계열 컬렉션
		 * 		- 저장 순서를 유지하지 않는다.
		 * 		- 중복을 허용하지 않는다.
		 * 		- 구현 클레스로 HashSet, LinkedHashSet, TreeSet 등이 있다.
		 */

		/*
		 * HashSet
		 * 		- 객체를 저장할 때 hash 함수를 사용하여 처리 속도가 빠르다.
		 * 		- 동일 객체 뿐 아니라 동등 객체도 중복하여 저장하지 않는다.
		 * 
		 * LinkedHashSet
		 * 		- HashSet 과 동일하지만 Set 에 추가되는 데이터들의 순서가 유지된다.
		 * 
		 * TreeSet
		 * 		- 검색 기능을 강화한 컬렉션으로 계층 구조를 활용해 이진 트리 자료구조로
		 * 		  구현되어 있다.
		 */
		
		HashSet<Integer> aSet = new HashSet<Integer>();
		
		// 데이터 추가
		aSet.add(Integer.valueOf(10)); aSet.add(Integer.valueOf(20));
		aSet.add(Integer.valueOf(30)); aSet.add(Integer.valueOf(40));
		aSet.add(Integer.valueOf(50)); aSet.add(Integer.valueOf(60));
		
		System.out.println(aSet);
		
		// 데이터 추가
		HashSet<Integer> bSet = new HashSet<Integer>();

		bSet.add(Integer.valueOf(70)); bSet.add(Integer.valueOf(80));
		bSet.add(Integer.valueOf(90)); bSet.add(Integer.valueOf(100));
		aSet.addAll(bSet);
		
		System.out.println(aSet);
		
		// 데이터 검색
		boolean isExists = aSet.contains(Integer.valueOf(30));
		System.out.println("정수 30 존재유무: " + isExists);
		isExists = aSet.contains(Integer.valueOf(35));
		System.out.println("정수 35 존재유무: " + isExists);

		// 데이터 삭제
		bSet.remove(Integer.valueOf(80));
		System.out.println(bSet);
		
		// 데이터 전부 삭제
		bSet.clear();
		System.out.println(bSet);
		
		// 컬렉션에 데이터가 비어 있는지 확인
		boolean isEmpty = bSet.isEmpty();
		System.out.println("컬렉션에 데이터가 비어 있는지 확인 : " + isEmpty);
		
		// 컬렉션에 데이터가 몇 개 있는지 확인
		int size = aSet.size();
		System.out.println("데이터 " + size + " 개 있습니다.");
	
		// foreach 문을 사용하여 전체 탐색
		for(Integer n: aSet) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		// Set 컬렉션을 List 컬렉션으로 변경
		List<Integer> aList = new ArrayList<Integer>(aSet);
		Collections.sort(aList);
		System.out.println(aList);
		 
		// List 컬렉션을 Set 컬렉션으로 변경
		Set<Integer> cSet = new HashSet<Integer>(aList);
		System.out.println(cSet);
	}

}
