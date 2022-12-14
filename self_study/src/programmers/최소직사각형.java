package programmers;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++) {
        	if(sizes[i][0] > sizes[i][1]) {
        		w[i] = sizes[i][0];
        		h[i] = sizes[i][1];
        	} else {
        		h[i] = sizes[i][0];
        		w[i] = sizes[i][1];
        	}
        }
        int maxw = 0;
        int maxh = 0;
        for(int i = 0; i < w.length; i++) {
        	if(maxw < w[i]) {
        		maxw=w[i];
        	}
        }
        for(int i = 0; i < w.length; i++) {
        	if(maxh < h[i]) {
        		maxh=h[i];
        	}
        }
        int answer = maxw * maxh;
        System.out.println(answer);
    }
}
