package homepage.database;

import java.sql.*;

/**
 * DBAccess
 * @author anders
 * The class you need to import if you need your class to get or set information in the database.
 */
public abstract class DBAccess {
	private static Connection connect					= null;
	private Statement statement					= null;
	private ResultSet resultSet					= null;

	private static DBAccess instans;
	
	abstract public Users getUser(String email) throws Exception;	
	
	synchronized public static DBAccess getConnection() throws Exception{
		if (instans != null) return instans;
		
		instans = new DBOracle();
		
		return instans;
	}
}