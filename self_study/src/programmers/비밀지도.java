package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] answer = {};
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        String str = Integer.toString(12, 2);
//        System.out.println(str);
//        System.out.println(str.charAt(1));
//
//        System.out.println(Integer.toString(9, 2));
        for(int i = 0; i < map1.length; i++) {
            for(int j = 0; j < map1[i].length; j++) {
                map1[i][j] = 0; //map1 초기화
            }
        }
        for(int i = 0; i < map2.length; i++) {
            for(int j = 0; j < map2[i].length; j++) {
                map2[i][j] = 0; //map2 초기화
            }
        }
//        if(0 <= arr1[0] && arr1[0] <= Math.pow(2, n-1) - 1) {
//            map1[i][0] = 1;
//        }
//        System.out.println((Integer.toString(arr1[0], 2)));
        for(int i = 0; i < map1.length; i++) {
            Stack s = new Stack();
            s.push(Integer.toString((arr1[i]), 2));
            for(int j = map1[i].length-1; j >= 0; j--) {
                map1[i][j] += (int)s.pop();
            }
        }
        System.out.println(Arrays.deepToString(map1));
    }


}
