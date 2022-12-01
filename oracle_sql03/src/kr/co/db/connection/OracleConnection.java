package kr.co.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleConnection {

	private final static String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String ORACLE_URL = "jdbc:oracle:thin:@";
	
	private Connection conn;
	private PreparedStatement pstat;
	
	public OracleConnection(String url, String username, String password) throws ClassNotFoundException, SQLException {
		Class.forName(ORACLE_DRIVER);
		this.conn = DriverManager.getConnection(ORACLE_URL + url, username, password);
	}
	
	public PreparedStatement getPrepared(String query) throws SQLException {
		this.pstat = this.conn.prepareStatement(query);
		return this.pstat;
	}
	
	public ResultSet sendSelect() throws SQLException {
		return this.pstat.executeQuery();
	}
	
	public int sendInsert() throws SQLException {
		return this.pstat.executeUpdate();
	}
	
	public int sendUpdate() throws SQLException {
		return this.pstat.executeUpdate();
	}
	
	public int sendDelete() throws SQLException {
		return this.pstat.executeUpdate();
	}
	
	public void close() throws SQLException {
		if(this.pstat != null) {
			this.pstat.close();
		}
		
		if(this.conn != null) {
			this.conn.close();
		}
	}
	
}
