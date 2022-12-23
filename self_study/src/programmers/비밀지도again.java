package programmers;

import java.util.Arrays;

public class 비밀지도again {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] answer = new String[n];
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < arr1.length; i++) {
        	for(int j = 0; j < n-Integer.toBinaryString(arr1[i]).length(); j++) {
        		str1 += 0;
        	}
        	str1 += Integer.toBinaryString(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
        	for(int j = 0; j < n-Integer.toBinaryString(arr2[i]).length(); j++) {
        		str2 += 0;
        	}
        	str2 += Integer.toBinaryString(arr2[i]);
        }
        String a = "";
        for(int i = 0; i < str1.length(); i++) {
        	if((int)str1.charAt(i) + (int)str2.charAt(i) == 96) {
        		a += " ";
        	} else {
        		a += "#";
        	}
        }
        System.out.println(a);
        for(int i = 0; i < n; i++) {
        	answer[i] = a.substring(n*i, n*(i+1));
        }
        System.out.println(Arrays.toString(answer));
        long afterTime = System.currentTimeMillis(); 
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);

	}

}
