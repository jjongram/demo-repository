package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main1152 {
	
	public static long countChar(String str, char ch) {       
		return str.chars()
				.filter(c -> c == ch)                
				.count();
	}
	
	public static void test() {
		String s = "        sfdgdfg     dtghdyghyd     dfghtdtgh";
		String sArr[] = s.split(" ");
		for(int i = 0; i < sArr.length; i++) {
			if(!sArr[i].isBlank()) {
				System.out.println(sArr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		test();
		System.exit(0);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
//		if(str.equals(" ")) {
//			System.out.println(countChar(str, ' '));
//		}else {
//			System.out.println(countChar(str, ' ')+1);			
//		}
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		if(arr.length==1) {
			if(arr[0].equals(" ")) {
				System.out.println(arr[0]);
			}
		}
	}

}
