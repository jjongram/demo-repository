package programmers;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class pokemon {

	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 2};
		
		int answer = 0;
	    Set<Integer> s = new HashSet<>();
	    for(int i = 0; i < nums.length; i++){
	    	s.add(nums[i]);
	    }
	        
	    if(nums.length/2 <= s.size()){
	    	answer = nums.length/2;
	    } else{
	    	answer = s.size();
	    }
	    System.out.print(answer);
	}

}
