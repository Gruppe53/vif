package homepage.database;

import java.sql.*;

public class DBManager {
	private String dbUrl;
	private String dbUser;
	private String dbPass;

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}

	public String getDbUrl() {
		return this.dbUrl;
	}

	public String getDbUser() {
		return this.dbUser;
	}

	public String getDbPass() {
		return this.dbPass;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(getDbUrl(), getDbUser(), getDbPass());
		} catch (SQLException e) {
			System.out.println("Could not connect to DB: " + e.getMessage());
		}
		
		return conn;
	}
	
	public void putConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("No connection open: " + e.getMessage());
			}
		}
	} 
}
