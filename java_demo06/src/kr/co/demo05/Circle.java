package kr.co.demo05;

public class Circle {

	private static final double PI = 3.14;
	private double radius;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
		this.area = radius * radius * Circle.PI;
	}
	
	public double getRadius() {
		return this.radius;
		
	}
	public double getArea() {
		return this.area;
	}
	
	public double getPI() {
		return Circle.PI;
	}
}

//public class ClassNameHere {
//	public static void main(String[] args) {
//		Circle c1 = new Circle(10);
//		Circle c2 = new Circle(20);
//		Circle c3 = new Circle(30);
//	}
//}
