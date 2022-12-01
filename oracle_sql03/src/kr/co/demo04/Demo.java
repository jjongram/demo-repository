package kr.co.demo04;

import java.util.Date;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.db.connection.OracleConnection;


import kr.co.db.connection.*;
import kr.co.vo.EmployeeVO;

public class Demo {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      OracleConnection oc = new OracleConnection("localhost:1521/XEPDB", "dev02", "dev02");
      
      EmployeeVO emp = new EmployeeVO();
      emp.setEmpId(210);
      emp.setFirstName("길동");
      emp.setLastName("홍");
      emp.setEmail("HGILDONG");
      emp.setPhoneNumber("512.123.1234");
      emp.setHireDate(new java.util.Date());
      emp.setJobId("IT_PROG");
      emp.setSalary(2800);
      emp.setCommission(0);
      emp.setManagerId(103);
      emp.setDeptId(60);
      
      String query = "INSERT INTO EMPLOYEES VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      // --------------------------------
      PreparedStatement pstat = oc.getPrepared(query);
      
      pstat.setInt(1, emp.getEmpId());
      pstat.setString(2, emp.getFirstName());
      pstat.setString(3, emp.getLastName());
      pstat.setString(4, emp.getEmail());
      pstat.setString(5, emp.getPhoneNumber());
      pstat.setDate(6, emp.getHireDate());
      // java.util.Date now = new java.util.Date();
      // pstat.setDate(6, new Date(now.getTime());
      // Date에 대한 import는 1개만 가능하고, 
      // 현재 .sql.Date가 임포트 되어있기때문에
      // java.util.Date로 지정해주어야한다.
      
      pstat.setString(7, emp.getJobId());
      pstat.setInt(8, emp.getSalary());
      pstat.setDouble(9, emp.getCommission());
      //pstat.setNull(9, 0); // NULL
      
      pstat.setInt(10, emp.getManagerId());
      pstat.setInt(11, emp.getDeptId());
      // --------------------------------

      
      // 작성한 Query 전송 후 int 반환 (반영된 행의 갯수이다.)
      int rs = oc.sendInsert();
      

      // 반환 받은 ResultSet의 내용 추출 및 추가 작성
      System.out.println(rs + "개 행이 반영되었습니다");

      
      // Database 관련 연결 정보 Close
      oc.close();

   }

}