package programmers;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "0233334444";
		for(int i = 0; i < phone_number.length()-4; i++) {
			System.out.print("*");
		}
		System.out.println(phone_number.substring(phone_number.length()-4, phone_number.length()));
	}

}
