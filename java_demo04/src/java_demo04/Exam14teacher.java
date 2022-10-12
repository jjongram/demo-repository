package java_demo04;

public class Exam14teacher {

	public static void main(String[] args) {
	switch() {
	case:
	
		for(int day = dateIndex; day > 0; day--) {
			System.out.println("\t");
		}
	}
	
		dateIndex = dateIndex == 0 ? 7 : dateIndex;
		for(int day = 0; day < lastDay; day++) {
			System.out.printf("%d\t", day + 1);
			if((day + 1) % 7 == 7 - dateIndex) {
				System.out.println();
			}
		}
	}
}
