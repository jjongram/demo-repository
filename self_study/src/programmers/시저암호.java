package programmers;
public class 시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            if((97 <= (int)s.charAt(i) && (int)s.charAt(i) <= 122) || (65 <= (int)s.charAt(i) && (int)s.charAt(i) <= 90)){
                answer += (char)(((int)s.charAt(i)+n));
            }
        }
        System.out.println(answer);
        System.out.println((int)'z');
        System.out.println((int)'a');
    }
}
