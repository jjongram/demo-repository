package programmers;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPPPoooyyYy";
		s = s.toLowerCase();
		int cntp = 0;
		int cnty = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p') {
				cntp++;
			} else if(s.charAt(i) == 'y') {
				cnty++;
			}
		}
		if(cntp == cnty) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
