package programmers;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "2threethree45sixseven";
		s = s.replaceAll("zero", "0");
		s = s.replaceAll("one", "1");
		s = s.replaceAll("two", "2");
		s = s.replaceAll("three", "3");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("five", "5");
		s = s.replaceAll("six", "6");
		s = s.replaceAll("seven", "7");
		s = s.replaceAll("eight", "8");
		s = s.replaceAll("nine", "9");
		int a = Integer.parseInt(s);
		System.out.println(a);
	}

}
