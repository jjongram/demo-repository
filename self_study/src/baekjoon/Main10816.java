package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
        String[] a = br.readLine().split(" ");
        
        for(int i = 0; i < n; i++) {
        	list.add(Integer.valueOf(a[i]));
        }
        
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> list2 = new ArrayList<>();
        String[] b = br.readLine().split(" ");

        for(int i = 0; i < m; i++) {
        	list2.add(Collections.frequency(list, Integer.valueOf(b[i])));
        }
        bw.write(list2.toString().replace("[", "").replace("]", "").replace(",", ""));
        bw.flush();
    }
}
