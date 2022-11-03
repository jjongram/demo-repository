package kr.co.exam01;

public class Triangle extends Shape{
	public Triangle() { }
	@Override
	public int getArea() {
		//super.getArea(width, length);
		//return (width * length) / 2;
		return super.getArea()/2;
	}
}
