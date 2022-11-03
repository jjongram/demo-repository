package kr.co.exam06;

import java.util.Objects;

public class Student {
	public String name;
	public int year;
	public int room;
	public int number;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int year, int room, int number) {
		super();
		this.name = name;
		this.year = year;
		this.room = room;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number, room, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && number == other.number && room == other.room && year == other.year;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + ", room=" + room + ", number=" + number + "]";
	}
	
	
}
