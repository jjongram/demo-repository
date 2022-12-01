package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class asd {

	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	      int first_time = Integer.parseInt(st.nextToken());
	      int first_minute = Integer.parseInt(st.nextToken());
	      
	      String extime = br.readLine();
	      int time = Integer.parseInt(extime);
	      
	      int total = 0;

	      if ((first_time >= 0 && first_time <= 23) && (first_minute >= 0 && first_minute <= 59) && (time >=0 && time <=1000)) {
	         first_minute  = first_minute + time;
	         total = (first_time*3600) + (first_minute*60);
	         first_time = total / (60 * 60);
	         first_minute = total % (60 * 60)/60;
	   
	         
	         if (first_time > 23) {
	            first_time = first_time - 24;
	         }
	         
	      }else {
	         System.out.println("오류");
	      }
	      
	      System.out.println(first_time + " " + first_minute);

	}

}
