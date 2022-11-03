package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	String[] a = br.readLine().split(" ");
        	list.add(Integer.valueOf(a[i]));
        }
        
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	list2.add(Collections.frequency(list, Integer.parseInt(br.readLine())));
        }
        System.out.println(list2.toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}
