package programmers;

import java.util.ArrayList;
import java.util.List;

public class 소수찾기 {

	public static void main(String[] args) {
        int n = 100;
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int answer1 = 0;
        list.add(2);
        for(int i = 3; i <= n; i=i+2) {
        	int cnt = 0;
        	int SIZE = list.size()/2;
            for(int j = 0; j < SIZE; j++){
                if(i % list.get(j) == 0){
                	cnt++;
                }
            }
            if(cnt == 0) {
            	list.add(i);
            	answer++;
            }
        }
//        System.out.println(list);
//        answer = list.size();
        System.out.println(list.size());
        System.out.println(answer+1);
	}

}
