package programmers;

import java.util.Arrays;

public class 안전지대 {

	public static void main(String[] args) {
//		long beforeTime = System.currentTimeMillis();
		int[][] board = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		
//		System.out.println(Arrays.deepToString(board));
		int[][] temp = new int[board.length+2][board[0].length+2];
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				temp[i][j] = 0;
			}
		}
		for(int i = 1; i < temp.length-1; i++) {
			for(int j = 1; j < temp[i].length-1; j++) {
				temp[i][j] = board[i-1][j-1];
			}
		}

		
//		System.out.println(Arrays.deepToString(temp));
		for(int i = 1; i < temp.length-1; i++) {
			for(int j = 1; j < temp[i].length-1; j++) {
				if(temp[i][j] %2== 1) {
					temp[i-1][j] += 2;
					temp[i-1][j+1] += 2;
					temp[i-1][j-1] += 2;
					temp[i][j+1] += 2;
					temp[i][j-1] += 2;
					temp[i+1][j] += 2;
					temp[i+1][j+1] += 2;
					temp[i+1][j-1] += 2;
				}
			}
		}
//		System.out.println(Arrays.deepToString(temp));
		int cnt = 0;
		for(int i = 1; i < temp.length-1; i++) {
			for(int j = 1; j < temp[i].length-1; j++) {
				if(temp[i][j] == 0) {
					cnt++;
				}
			}
		}	
		System.out.println(cnt);
//		long afterTime = System.currentTimeMillis(); 
//		long secDiffTime = (afterTime - beforeTime)/1000;
//		System.out.println("시간차이(m) : "+secDiffTime);
	}

}
