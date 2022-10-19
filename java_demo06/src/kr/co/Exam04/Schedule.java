package kr.co.Exam04;

public class Schedule {
	private int year;
	private int month;
	private int day;
	private boolean allday = false;
	private String startTime;
	private String endTime;
	

	public Schedule(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void changeToAllday() {
		System.out.println("종일로변경 로직");
	}
	public void changeToTime() {
		System.out.println("시간으로변경 로직");
	}
	public void changeDay() {
		System.out.println("일자변경 로직");
	}
	public void checkSchedule() {
		System.out.println("스케쥴확인 로직");
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public boolean isAllday() {
		return allday;
	}
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}
}
