package kr.co.exam04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Exam {

	public static void main(String[] args) {
		/*
		 * 현재 날짜를 구하고 다음 형식에 맞추어 출력하세요.
		 * 		1. 2022/01/01
		 * 		2. 2022년 01월 01일
		 * 		3. 12시 30분 30초
		 * 		4. 12:30:30
		 * 
		 * 2022년 10월 중 주말에 해당하는 날짜만 문자열 배열에 담아 출력하세요.
		 * 
		 * 자신의 생년월일을 입력하면 현재로부터 몇 일 남았는지 알려주는 D-DAY 정보를
		 * 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        LocalTime t = LocalTime.now();
        int year = now.getYear();
        String month = now.getMonth().toString();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int dayOfYear = now.getDayOfYear();
        String dayOfWeek = now.getDayOfWeek().toString();
        int dayOfWeekValue = now.getDayOfWeek().getValue();
        System.out.println(dayOfWeek);
//        System.out.println(now); // 2021-06-17
//        System.out.println(monthValue); // JUNE(6)
//        System.out.println(dayOfMonth); // 17
//        System.out.println(dayOfYear); // 168
        System.out.println("1. " + year + "/" + monthValue + "/" + dayOfMonth);
        System.out.println("2. " + year + "년 " + monthValue + "월 " + dayOfMonth + "일");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String formatedNow = t.format(formatter);
        System.out.println("3. " + formatedNow);  // 06시 20분 57초
        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        formatedNow = t.format(formatter);
        System.out.println("4. " + formatedNow);  // 06시 20분 57초

//        System.out.println(now.getDayOfYear()-bday.getDayOfYear());  // // 2021-12-25
        LocalDate bDay = LocalDate.of(1995, 2, 28);
        if(now.getDayOfYear()-bDay.getDayOfYear()>0) {
            System.out.println(bDay.getDayOfYear()-now.getDayOfYear() +365 + "일 남았습니다.");
        } else if(now.getDayOfYear()-bDay.getDayOfYear()<0){
            System.out.println(bDay.getDayOfYear()-now.getDayOfYear() + "일 남았습니다.");
        }
	}

}
