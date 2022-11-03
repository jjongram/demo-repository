package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String T = br.readLine();
		int[][] arr = new int[Integer.parseInt(T)][2];
		
		for(int i=0; i<arr.length; i++) {
			String[] d = br.readLine().split(" ");
			arr[i][0] = Integer.valueOf(d[0]);
			arr[i][1] = Integer.valueOf(d[1]);
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, arr[i][0], arr[i][1], arr[i][0] + arr[i][1]);
		}
	}
}
