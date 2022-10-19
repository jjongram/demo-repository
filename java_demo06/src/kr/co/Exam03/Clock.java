package kr.co.Exam03;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	private boolean am;
	private boolean pm;
	//생성자
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.setAmPm();
	}
	//am pm 메서드
	private void setAmPm() {
		if(this.hour>=12) {
			this.am = false;
			this.pm = true;
		} else {
			this.am = true;
			this.pm = false;
		}
	}
	public String getAmPm() {
		 if (am == true) {
		 return "오전";
		} else {
		 return "오후";
		}
	}
	
	public String getTime() {
		//getTime로직 생성
		return "str";
	}
	//1초후
	public void nextSecond() {
		second++;
		if(second >=60) {
			nextMinute();
			second = 0;
		}
		
	}
	public void nextMinute() {
		
	}

	public void nextHour() {
		
	}

	public void prevSecond() {
		
	}

	public void prevMinute() {
		
	}

	public void prevHour() {
		
	}

	
}
