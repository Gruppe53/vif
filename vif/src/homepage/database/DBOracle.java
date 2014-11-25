package homepage.database;

import java.sql.*;
import java.util.*;

public class DBOracle extends DBAccess{
private Connection connect;
private Statement statement;
	
	public DBOracle() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://" + DBInfo.DB_HOST + ":" + DBInfo.DB_PORT + "/" + DBInfo.DB_DATABASE, DBInfo.DB_USERNAME, DBInfo.DB_PASSWORD);
		statement = connect.createStatement();
	}

	@Override
	public Users getUser(String email) throws Exception {
		statement.executeQuery("");
		
		return null;
	}
	
	
}
