package kr.co.Exam06;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.add("라면", 3500);
		menu.add("치즈라면", 4000);
		menu.add("김밥", 3000);
		menu.add("치즈김밥", 3500);
		menu.add("참치김밥", 3500);
		menu.add("돈까스", 4000);
		menu.add("치즈돈까스", 4500);
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		while(true) {
			System.out.print("메뉴 선택 : ");
			name = sc.nextLine();
			
			if(name.equals("exit")) {
				break;
			}
			
			int price = menu.getPrice(name);
			if(price != -1) {
				System.out.printf("%s 메뉴를 선택하였습니다. 가격은 %,d 입니다.", name, price);
			} else {
				System.out.printf("%s 에 해당하는 메뉴는 없습니다.", name);
			}
		}
	}
}