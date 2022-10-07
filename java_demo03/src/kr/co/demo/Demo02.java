package kr.co.demo;

public class Demo02 {

	public static void main(String[] args) {
		//산술연산
		int x1 = 3;
		int y1 = 2;
		
		System.out.println("더하기(+) 연산 결과" + (x1 + y1));
		System.out.println("빼기(-) 연산 결과" + (x1 + y1));
		System.out.println("곱하기(*) 연산 결과" + (x1 + y1));
		System.out.println("나누기(/) 연산 결과" + (x1 + y1));
		System.out.println("나머지(%) 연산 결과" + (x1 + y1));

		double x2 = 3.0;
		System.out.println("더하기(+) 연산 결과" + (x2 + y1));
		System.out.println("뺴기(-) 연산 결과" + (x2 + y1));
		System.out.println("곱하기(*) 연산 결과" + (x2 + y1));
		System.out.println("나누기(/) 연산 결과" + (x2 + y1));
		System.out.println("나머지(%) 연산 결과" + (x2 + y1));

		//비교연산
		System.out.println("> 연산 결과" + (x1 + y1));
		System.out.println("< 연산 결과" + (x1 + y1));
		System.out.println(">= 연산 결과" + (x1 + y1));
		System.out.println("<= 연산 결과" + (x1 + y1));
		System.out.println("== 연산 결과" + (x1 + y1));
		System.out.println("!= 연산 결과" + (x1 + y1));

		//논리연산
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("논리 true && true 연산 결과 -> " + (b1 && b1));
		System.out.println("논리 true && false 연산 결과 -> " + (b1 && b2));
		System.out.println("논리 false && true 연산 결과 -> " + (b2 && b1));
		System.out.println("논리 false && false 연산 결과 -> " + (b2 && b2));

		System.out.println("논리 true || true 연산 결과 -> " + (b1 || b1));
		System.out.println("논리 true || false 연산 결과 -> " + (b1 || b2));
		System.out.println("논리 false || true 연산 결과 -> " + (b2 || b1));
		System.out.println("논리 false || false 연산 결과 -> " + (b2 || b2));

		//증감연산
		int z1 = 10;
		int z2 = 10;
		
		System.out.println("전위 증감 연산 ++z1 결과 -> " + (++z1));
		System.out.println("후위 증감 연산 z2++ 결과 -> " + (z2++));

		System.out.println("전위/후위 최종 결과 -> " + z1 + "/" + z2);
		
		//삼항연산
		int x = 1;
		int y = 0;
		y = x > 3 ? 5 : 10;
		System.out.println(y);
		
	}

}
