package kr.co.demo01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Java 로 Oracle DB 에 접속해서 데이터 조회
		 * 		1. JDBC 라이브러리 필요
		 * 
		 * 		2. JDBC 라이브러리를 이클립스 프로젝트에 등록
		 * 			A. 프로젝트 설정 메뉴로 이동
		 * 			B. Java Build Path 메뉴로 이동
		 * 			C. Libraries 탭으로 이동
		 * 			D. Classpath 선택 후 Add External JARs...버튼 클릭
		 * 			E. JDBC 라이브러리 파일 선택
		 * 
		 * 		3. 다음의 순서에 맞추어 코드 작성
		 * 			A. Oracle Driver 등록
		 * 			B. Database Connection 생성
		 * 			C. Statement 객체 생성
		 * 			D. Query 작성
		 * 			E. 작성한 Query 전송 후 ResultSet 반
		 * 			F. 반환 받은 ResultSet 의 내용 추출 및 추가 작업
		 * 			G. Database 관련 연결정보 Close
		 */
		
		// Oracle Driver 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Database Connection 생성
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "dev01";
		String password = "dev01";
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// Statement 객체 생성
		Statement stat = conn.createStatement();
		
		// Query 작성(쿼리 문자열에 세미콜론을 작성하지 마세요.)
		String query = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATE FROM EMPLOYEES";
		
		// 작성한 Query 전송 후 ResultSet 반환
		ResultSet rs = stat.executeQuery(query);
		
		// 반환 받은 ResultSet 의 내용 추출 및 추가 작성
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		while(rs.next()) {
			int id = rs.getInt("EMPLOYEE_ID");
			String fName = rs.getString("FIRST_NAME");
			String lName = rs.getString("LAST_NAME");
			Date hireDate = rs.getDate("HIRE_DATE");
			
			System.out.printf("| %d | %15s | %15s | %s |\n", id, fName, lName, df.format(hireDate));
		}
		// Database 관련 연결 정보 Close
		rs.close();
		stat.close();
		conn.close();
	}

}
