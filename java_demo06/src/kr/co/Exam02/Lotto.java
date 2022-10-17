package kr.co.Exam02;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int id;
	private int numbers[];
	private int bonus;
	//		 * - 회차는 한 번 정해지면 변경할 수 없어야 한다.
	public void Lotto(int id) {
		this.id = id;
		this.numbers = new int[6];
	}
	
	public void generate() {
		System.out.println("1~ 46 사이의 로또 번호 6개 생성");
//		Random rand = new Random();
//		for(int i = 0; i < numbers.length;) {
//			int num = rand.nextInt(46) + 1;
//			boolean duplicate = false;
//			for(int j = 0; j < i; j++) {
//				if(this.numbers[j] == num) {
//					duplicate = true;
//					break;
//				}
//			}
//			if(!duplicate) {
//				this.numbers[i] = num;
//				i++;
//			}
//		}
//		this.bonus = this.numbers[this.numbers.length - 1];
//		this.numbers = Arrays.copyOf(this.numbers, 6);
	}
	
	public String getLotto() {
		String str = "";
		for(int i = 0; i < this.numbers.length; i++) {
			str += this.numbers[i] + ", ";
		}
		return str + this.bonus;
	}
}


