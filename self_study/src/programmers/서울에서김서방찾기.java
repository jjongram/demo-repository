package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Kim"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(seoul));
		int index = list.indexOf("Kim");
		String answer = "김서방은 " + index + "에 있다";
		System.out.println(answer);
	}

}
