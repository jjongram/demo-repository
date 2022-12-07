package kr.co.self;

public class MyMath {
	int a = 5;
	int b = 9;
	
	static void plus(int a, int b) {
		int result = 0;
		System.out.println(a+b);
	}
	
	int min() {
		int result = 0;
		if(a > b) {
			result = b;
		} else {
			result = a;
		}
		return result;
	}

	public static void main(String[] args) {
		MyMath.plus(3, 5);
		MyMath mm = new MyMath();
		mm.min();
		System.out.println(mm.min());
	}

}
