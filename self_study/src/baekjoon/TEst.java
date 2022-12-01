package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TEst {

   public static void main(String[] args) throws IOException {
      /*
       * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은
       * 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로
       * 계산한다.
       * 
       * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
       * 
       * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을
       * 작성하시오.
       */

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