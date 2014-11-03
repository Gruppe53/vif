package homepage.database;

import java.sql.*;

public class DBAccess {
	private Connection connect					= null;
	private Statement statement					= null;
	private ResultSet resultSet					= null;
	
	private String DBHost;
	private int DBPort;
	private String DBDatabase;
	private String DBUserName;
	private String DBPassword;
	
	public DBAccess() {
		
		System.out.println("init");
	}
}
