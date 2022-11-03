package kr.co.exam01;

public class Shape {
	public int width;
	public int length;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	//생성자
	public Shape() {
	}

	public int getArea() {
		return this.width * this.length;
//		System .out.println(a);
	}
}

