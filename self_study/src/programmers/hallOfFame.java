package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hallOfFame {

	public static void main(String[] args) {
		int k = 4;
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int[] answer = new int[score.length];
		ArrayList<Integer> HOF = new ArrayList<>();
		for(int i = 0; i < score.length; i++) {
			HOF.add(score[i]);
			Collections.sort(HOF);
			Collections.reverse(HOF);
			if(i < k) {
				answer[i] = HOF.get(i);
			} else if(i >= k) {
				answer[i] = HOF.get(k-1);
			}
		}
		System.out.println(Arrays.toString(answer));
	}
	
}
