package homepage.database;

import homepage.data.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBParticipantAcccess extends DBAccess {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DBParticipantAcccess() {
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
	public List<?> getAll() throws SQLException {
		List<Participant> participants = new ArrayList<Participant>();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM users "
				+ "JOIN user_levels ON users.fk_u_level_id = user_levels.user_level_id "
				+ "JOIN shift_bids ON users.email = shift_bids.fk_email");
		
		while(rs.next()) {
			participants.add(
				new Participant(
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
					rs.getInt("user_level"),
					rs.getInt("f_id"),
					rs.getBoolean("prepar"),
					rs.getBoolean("workcamp"),
					rs.getString("comment"),
					rs.getString("fk_email")
				)
			);
		}
		
		for(int i = 0; i < participants.size(); i++) {
			pstmt = conn.prepareStatement("SELECT * FROM shift_wish "
					+ "JOIN period ON shift_wish.fk_p_id = period.p_id "
					+ "WHERE fk_f_id = ? "
					+ "AND fk_festival_year IN "
					+ "(SELECT MAX(festival_year) FROM `schedule` "
					+ "WHERE active = 1) "
					+ "ORDER BY weight ASC");
			pstmt.setInt(1, participants.get(i).getF_id());
			
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					participants.get(i).addToBidList(
						new ParticipantBid(
							rs.getInt("weight"),
							rs.getInt("festival_day"),
							rs.getTime("start_time"),
							rs.getTime("end_time")
						)
					);
				}
			}
		}
		
		return participants;
	}

	@Override
	public Participant getSpecific(String clause) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSpecific(ArrayList<String> data) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSpecific(String clause) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
