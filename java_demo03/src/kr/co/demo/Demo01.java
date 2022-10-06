package kr.co.demo;

public class Demo01 {

	public static void main(String[] args) {
		//연산자
		int x = 10;
		// x += 1 ; -> x = x + 1;
		// x -= 1 ; -> x = x - 1;
		// x *= 2 ; -> x = x * 2;
		// x /= 2 ; -> x = x / 2;
		x /= 2;
		
		System.out.println(x);
		
		for(int y = 0, z = 2; y < 5; y++, z += 2) {
			System.out.println(y + "/" + z);
		}
		
		x = 8;
		// x > 3 이 비교가 참이면 변수 x 에 10 을 저장하고 거짓이면 0 을 저장해라.
		x = x > 3 ? 10 : 0;
		System.out.println(x);
		
//		단항 연산자
//		증감 연산자 : ++, --
//		전위 연산
//		int a = 10;
//		int b = ++a;
//		System.out.println(a + ", " + b);
//		
//		후위 연산자
//		int a = 10;
//		int b = a++;
//		System.out.println(a + ", " + b);
	}

}
