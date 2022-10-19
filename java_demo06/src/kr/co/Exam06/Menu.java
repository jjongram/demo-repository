package kr.co.Exam06;

import java.util.Arrays;

public class Menu {
	
	private Food food[];
	
//	public Menu() {
//		this.food = new Food[0];
//	}
	
	/**
	 * 이 메서드는 메뉴 객체에 저장된 데이터를 문자열로 만들어
	 * 반환하는 메서드입니다.
	 * @return
	 * 	모든 메뉴 정보가 있는 문자열을 반환합니다.
	 */
	public String getAll() {
		String str = "";
		for(int i = 0; i < this.food.length; i++) {
			Food f = this.food[i];
			str += String.format("%s\t%,d\n", f.name, f.price);
		}
		return str;
	}
	
	/**
	 * 이 메서드는 메뉴 배열에 새로운 메뉴를 추가하기 위한 기능의 메서드입니다.
	 * 
	 * @param menuName : 음식 메뉴에 추가할 메뉴명
	 * @param price : 음식 메뉴에 추가할 메뉴의 가격
	 */
	public void add(String menuName, int price) {
		boolean isExists = this.findIndex(menuName) != -1 ? true : false;
		
		if(!isExists) {
			this.food = Arrays.copyOf(this.food, this.food.length + 1);
			this.food[this.food.length - 1] = new Food(menuName, price);
		}
	}
	
	public boolean update(String menuName, int price) {
		int idx = this.findIndex(menuName);
		
		if(idx != -1) {
			this.food[idx].price = price;
			return true;
		}
		
		return false;
	}
	
	public void remove(String menuName) {
		int idx = this.findIndex(menuName);
		if(idx != -1) {
			for(int i = idx; i < this.food.length - 1; i++) {
				this.food[i] = this.food[i + 1];
			}
			this.food = Arrays.copyOf(this.food, this.food.length - 1);
		}
	}
	
	
	/**
	 * 메뉴를 찾아서 해당하는 메뉴의 가격을 반환하는 메서드
	 * @return
	 * 	-1 반환되면 해당 메뉴는 없는 메뉴입니다.
	 */
	public int getPrice(String menuName) {
		int idx = this.findIndex(menuName);
		return idx != -1 ? this.food[idx].price : idx;
	}
	
	private int findIndex(String menuName) {
		for(int i = 0; i < this.food.length; i++) {
			if(this.food[i].name.equals(menuName)) {
				return i;
			}
		}
		return -1;
	}
}