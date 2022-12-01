package programmers;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		String s = "qwer";
		char[] c = s.toCharArray();
		String answer = "";
		if(s.length() % 2 != 0) {
			answer = String.valueOf(c[s.length()/2]); 
		} else {
			answer += String.valueOf(c[s.length()/2-1]); 
			answer += String.valueOf(c[s.length()/2]); 
		}
	}

}
