package baekjoon;

import java.io.*;

public class Main15552again {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


			System.out.println("dd");
			String T = br.readLine();
			int[][] arr = new int[Integer.parseInt(T)][2];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("a");
				String[] A = br.readLine().split(" ");
				arr[i][0] = Integer.valueOf(A[0]);
				arr[i][1] = Integer.valueOf(A[1]);
				bw.write(arr[i][0]+arr[i][1] + "\n");
			}
			
			bw.flush();
//			br.close();
//			bw.close();
		
	}

}
