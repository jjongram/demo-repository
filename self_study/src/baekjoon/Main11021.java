package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
		String T = br.readLine();
		int[][] arr = new int[Integer.parseInt(T)][2];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("a");
			String[] A = br.readLine().split(" ");
			arr[i][0] = Integer.valueOf(A[0]);
			arr[i][1] = Integer.valueOf(A[1]);
//			bw.write("Case #i: " + arr[i][0]+arr[i][1] + "\n");
			System.out.printf("Case #%s: ",i+1);
			System.out.println(arr[i][0] + arr[i][1]);
		}
		
//		bw.flush();

		
	}

}
