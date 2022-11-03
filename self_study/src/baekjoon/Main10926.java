package baekjoon;

import java.util.Scanner;

class Joonas{
	String str;
	//constructor
	public Joonas() { }
	
	Scanner sc = new Scanner(System.in);
	
	public String victoria () {
		System.out.println("dd");
		String str = sc.nextLine();
		return str + "??!";
	}
}
	
	


public class Main10926 {

	public static void main(String[] args) {
		Joonas v = new Joonas();
		System.out.println(v.victoria());
	}
}
