package kr.co.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.db.connection.OracleConnection;
import kr.co.vo.JobVO;

public class JobDAO {
	
	private OracleConnection oc;
	
	public JobDAO() {
		try {
			this.oc = new OracleConnection("localHost:1521/XEPDB1", "dev01", "dev01");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<JobVO> selectAll() {
		String query = "SELECT * FROM JOBS";
		ArrayList<JobVO> arr = new ArrayList<JobVO>();
		
		try {
			this.oc.getPrepared(query);
			ResultSet rs = this.oc.sendSelect();
			
			while(rs.next()) {
				JobVO job = new JobVO();
				job.setJobId(rs.getString("JOB_ID"));
				job.setJobTitle(rs.getString("JOB_TITLE"));
				job.setMinSalary(rs.getInt("MIN_SALARY"));
				job.setMaxSalary(rs.getInt("MAX_SALARY"));
				arr.add(job);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arr;
	}

}
