package programmers;

import java.util.Arrays;
import java.util.List;

public class marathon {

	public static void main(String[] args) {
//		class Solution {
//		    public String solution(String[] participant, String[] completion) {
//		        List<String> list1 = Arrays.asList(participant);
//		        List<String> list2 = Arrays.asList(completion);
//		        for(int i = 0; i < list2.size(); i++) {
//		            list1.remove(list2.get(i));
//		        }
//		        
//		        String answer = list1.get(0);
//		        return answer;
//		    }
//		}
//		Solution s = new Solution();
		String [] participant = {"leo", "kiki", "eden"};
		String [] completion = {"kiki", "eden"};
        List<String> list1 = Arrays.asList(participant);
        List<String> list2 = Arrays.asList(completion);
        System.out.println(list1.get(0));
        list1.remove(1);
        System.out.println(list1.get(0));
//        for(int i = 0; i < list2.size(); i++) {
//            list1.remove(list2.get(i));
//        }
        
        String answer = list1.get(0);
        System.out.println(answer);
//		System.out.println(s.solution(participant, completion));
		
	}

}
