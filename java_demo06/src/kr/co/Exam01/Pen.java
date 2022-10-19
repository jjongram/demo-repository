package kr.co.Exam01;
/*
 * 펜(Pen) 클래스를 만들어 본다.
 * 펜 클래스는 다음의 특징 및 기능을 가진다.
 *		속성 : 색상, 볼 크기, 잉크 타입
 *		기능 : 심교체, 심나오게하기, 심들어가게하기
 *
 * 펜은 한 번 구입을 하면 색상, 볼 크기, 잉크 타입이 고정되어 있어 별도로 변경할 수 없다.
 *
 * 펜은 어떠한 종류의 심을 사용하느냐에 따라 색상, 잉크 타입을 변경할 수 있다.
 *
 * 펜의 심을 교체 한다고 해도 볼 크기는 변경할 수 없다.
 * 
 * 현재 사용하고 있는 펜의 색상, 볼 크기, 잉크 타입을 확인 할 수 있어야 한다.
 */

public class Pen {
	private String color;
	private int ballSize;
	private String inkType;
	private boolean simOut = false;
	
	public Pen(String color, int ballSize, String inkType) {
		this.color = color;
		this.ballSize = ballSize;
		this.inkType = inkType;
	}
	
	public void simChange(String color, String inkType) {
		this.color = color;
		this.inkType = inkType;
	}
	public void simIn() {
		simOut = true;
		System.out.println("심이 나와있습니다.");
	}
	public void simOut() {
		simOut = false;
		System.out.println("심이 들어가있습니다.");
	}
	public void write() {
		if(simOut = true) {
			System.out.println();
		}
	}
	
	public String getColor() {
		return color;
	}
	public int getBallSize() {
		return ballSize;
	}
	public String getInkType() {
		return inkType;
	}
	public boolean isSimOut() {
		return simOut;
	}

}
