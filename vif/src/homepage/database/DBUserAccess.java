package homepage.database;

import homepage.data.User;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class DBUserAccess extends DBAccess {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DBUserAccess() {
		try {
			Class.forName(DBInfo.DB_CLASS_TYPE);
			
			conn = DriverManager.getConnection(
					DBInfo.DB_HOST+
					DBInfo.DB_PORT+
					DBInfo.DB_DATABASE+
					DBInfo.DB_USERNAME+
					DBInfo.DB_PASSWORD
			);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<User> getAll() throws SQLException {
		List<User> users = new ArrayList<User>();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM users JOIN user_levels ON users.fk_u_level_id = user_levels.user_level_id ORDER BY email ASC");
		
		while(rs.next()) {
			users.add(
				new User(
					rs.getString("email"),
					rs.getString("f_name"), 
					rs.getString("l_name"), 
					rs.getDate("birth"), 
					rs.getString("phone"), 
					rs.getString("address"), 
					rs.getString("zip"), 
					rs.getString("city"), 
					rs.getString("nation"), 
					rs.getBoolean("public_email"), 
					rs.getBoolean("active"),
					rs.getInt("user_level")
				)
			);
		}
		
		return users;
	}

	@Override
	public User getSpecific(String clause) throws SQLException {
		User user = null;
		
		pstmt = conn.prepareStatement("SELECT * FROM users JOIN user_levels ON users.fk_u_level_id = user_levels.user_level_id WHERE email=?");
		pstmt.setString(1, clause);
		
		rs = pstmt.executeQuery();
		
		if(rs != null)
			new User(
				rs.getString("email"),
				rs.getString("f_name"), 
				rs.getString("l_name"), 
				rs.getDate("birth"), 
				rs.getString("phone"), 
				rs.getString("address"), 
				rs.getString("zip"), 
				rs.getString("city"), 
				rs.getString("nation"), 
				rs.getBoolean("public_email"), 
				rs.getBoolean("active"),
				rs.getInt("user_level")
			);
		
		return user;
	}

	@Override
	public boolean updateSpecific(ArrayList<String> data) throws Exception {
		boolean success = false;
		
		pstmt = conn.prepareStatement(
			"UPDATE users SET" +
			"f_name = ?," +
			"l_name = ?," +
			"birth = ?," +
			"phone = ?," +
			"address = ?," +
			"zip = ?," +
			"city = ?," +
			"password = ?," +
			"fk_u_level_id" +
			"WHERE email=?"
		);
		
		pstmt.setString(1, data.get(0)); // fname
		pstmt.setString(2, data.get(1)); // lname
		pstmt.setDate(3, (java.sql.Date) new SimpleDateFormat("yyyy-MM-dd").parse(data.get(2))); // birth
		pstmt.setString(4, data.get(3)); // phone
		pstmt.setString(5, data.get(4)); // address
		pstmt.setString(6, data.get(5)); // zip
		pstmt.setString(7, data.get(6)); // city
		pstmt.setString(8, data.get(7)); // password
		pstmt.setString(9, data.get(8)); // fk_u_level_id
		pstmt.setString(10, data.get(9)); // email
		
		if(pstmt.execute())
			success = pstmt.execute();
		
		return success;
	}

	@Override
	public boolean deleteSpecific(String clause) throws Exception {
		boolean success = false;
		
		pstmt = conn.prepareStatement(
			"DELETE FROM users " +
			"WHERE fk_u_level_id > 1 "+
			"AND email = ? " +
			"AND (SELECT COUNT(*) FROM shift_bids WHERE fk_email = ?) = 0"
		);
		
		pstmt.setString(1, clause);
		pstmt.setString(2, clause);
		
		if(pstmt.execute())
			success = pstmt.execute();
		
		return success;
	}
}
