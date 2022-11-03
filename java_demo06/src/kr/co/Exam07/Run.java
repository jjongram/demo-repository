package kr.co.Exam07;

import java.util.Scanner;

public class Run {
	   private Scanner sc = new Scanner(System.in);
	   private Student st = new Student("홍길동");
	   //생성자
	   private void printMenu() {
	      System.out.println("1. 성적표 출력");
	      System.out.println("2. 과목 성적 출력");
	      System.out.println("3. 과목 성적 추가");
	      System.out.println("4. 과목 성적 수정");
	      System.out.println("5. 과목 성적 삭제");
	      System.out.println("6. 프로그램 종료");
	   }

	   private void select(int number) {
	      switch (number) {
	      case 1:
	         // 성적표 출력 기능을 수행하는 메서드 호출
	    	 System.out.println(st.getAll()); 
	         break;
	      case 2:
	         // 과목 성적 출력을 수행하는 메서드 호출
	         break;
	      case 3:
	         // 과목 성적 추가 기능을 수행하는 메서드 호출
	    	  System.out.println("과목명 입력 : ");
	    	  String sbName = sc.nextLine();
	    	  System.out.println("점수 입력 : ");
	    	  int score = sc.nextInt();
	    	  st.add(sbName, score);
	         break;
	      case 4:
	         // 과목 성적 수정 기능을 수행하는 메서드 호출
	    	  System.out.println("과목명 입력 : ");
	    	  String sbNamec = sc.nextLine();
	    	  System.out.println("점수 입력 : ");
	    	  int scorec = sc.nextInt();
	    	  st.changeScore(sbNamec, scorec);
	         break;
	      case 5:
	         // 과목 성적 삭제 기능을 수행하는 메서드 호출
	    	  System.out.println("과목명 입력 : ");
	    	  String sbNamed = sc.nextLine();
	    	  st.remove(sbNamed);
	         break;
	      case 6:
	         System.out.println("프로그램이 종료 됩니다.");
	         System.exit(0); // 프로그램 종료
	      default:
	         // 메뉴 번호를 잘못 입력했을 경우
	      }
	   }

	   public void start() {
	      while (true) {
	         this.printMenu();
	         System.out.print("메뉴 번호 입력 : ");
	         int number = sc.nextInt();
	         sc.nextLine();//입력버퍼에 있는 개행 소진
	         this.select(number);

	         System.out.println("초기 메뉴로 돌아가려면 Enter 입력!");
	         sc.nextLine();
	      }
	   }
	}
