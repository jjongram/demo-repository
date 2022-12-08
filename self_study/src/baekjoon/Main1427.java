package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		char[] c = new char[str.length()];
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
//			arr[i] = (int)str.charAt(i)-48;
		}
//		System.out.println(arr.toString());
		System.out.println(c);
		List list = Arrays.asList(c);
//		Collections.sort(list);
//		Collections.reverse(list);
		System.out.println(list.toString());
	}

}
