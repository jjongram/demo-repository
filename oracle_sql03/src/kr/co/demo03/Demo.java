package kr.co.demo03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Oracle Driver 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Database Connection 생성
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "dev01";
		String password = "dev01";
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// Query 작성(쿼리 문자열에 세미콜론을 작성하지 마세요.)
		// 사용자 입력을 사용하여 사원ID를 입력 받고 입력받은 ID에 해당하는
		// 사원만 조회 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("사원 ID 입력 (100 ~ n) : ");
		String empIds = sc.nextLine();
		
		String query = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATE FROM EMPLOYEES";
		query += " WHERE EMPLOYEE_ID IN (?)";
		
		// PreparedStatement 객체 생성
		PreparedStatement pstat = conn.prepareStatement(query);
		pstat.setString(1, empIds);
		
		// 작성한 Query 전송 후 ResultSet 반환
		ResultSet rs = pstat.executeQuery(query);
		
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
		pstat.close();
		conn.close();
	}

}
