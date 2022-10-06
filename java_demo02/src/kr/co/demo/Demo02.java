package kr.co.demo;

public class Demo02 {

	public static void main(String[] args) {
		// 상수 : 변수는 변수 공간에 언제든 데이터를 수정할 수 있는 공간으로 사용
		//		 하지만 상수는 변수와 다르게 한번 초기화를 하면 더 이상 수정할 수 없는
		//		 공간으로 사용한다.
		
		// 상수명을 작명할 때는 변수명과의 구분을 위해 대문자로만 작성한다.
		// 또한 두 단어 이상의 조합으로 상수명을 작명할 때에는 카멜케이스 방식을
		// 사용할 수 없기 때문에 _ 문자를 사용하는 스네이크 케이스 방식을 사용한다.
		
		// 카멜케이스	-> projectExplorer
		// 스네이크케이스 -> PROJECT_EXPLORER
		
		// 상수를 선언 할 때에는 변수 선언 방식과 동일하며 단, 자료형 앞에 final 키워드를
		// 사용하면 된다.
		
		int projectExplorer = 10;
		final int PROJECT_EXPLORER = 20;
		final int GIT_REPOSITORIES;
		
		projectExplorer = 100;
		//PROJECT_EXPLORER = 200;
		GIT_REPOSITORIES = 300;
		
		System.out.println("확인");
	}

}
