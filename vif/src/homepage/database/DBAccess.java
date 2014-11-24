package homepage.database;

import java.sql.*;

/**
 * DBAccess
 * @author anders
 * The class you need to import if you need your class to get or set information in the database.
 */
public class DBAccess {
	private Connection connect					= null;
	private Statement statement					= null;
	private ResultSet resultSet					= null;
	
	private static final String DBHost = DBInfo.DB_HOST;
	private static final int DBPort = DBInfo.DB_PORT;
	private static final String DBDatabase = DBInfo.DB_DATABASE;
	private static final String DBUserName = DBInfo.DB_USERNAME;
	private static final String DBPassword = DBInfo.DB_PASSWORD;

	private static DBAccess instans = new DBAccess();
	
		
	public static DBAccess getConnection() {
		return instans;
	}
	
	/**
	 * doSqlQuery
	 * write the MySQL command to GET information from the SQL server.
	 * like: SELECT DISTINCT * FROM [table name] WHERE name = hans AND lastname = bjarne order by name;
	 * @param query - the MySQL query
	 * @return The information asked for (-1 if non was found)
	 * @throws Exception
	 * @throws SQLException
	 */
	public ResultSet doSqlQuery(String query) throws Exception, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			connect = DriverManager.getConnection("jdbc:mysql://" + DBHost + ":" + DBPort + "/" + DBDatabase, DBUserName, DBPassword);
			
			statement = connect.createStatement();
			resultSet = statement.executeQuery(query);

			return resultSet;
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	/**
	 * doSqlUpdate
	 * Write the MySQL command to SET information in the SQL server.
	 * Like: UPDATE [table name] SET name = bjarny WHERE name = bjarne;
	 * @param query - the MySQL query
	 * @return Int value of how many objects were affected by the Update.
	 * @throws Exception
	 * @throws SQLException
	 */
	public int doSqlUpdate(String query) throws Exception, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			connect = DriverManager.getConnection("jdbc:mysql://" + DBHost + ":" + DBPort + "/" + DBDatabase, DBUserName, DBPassword);
			
			statement = connect.createStatement();

			return statement.executeUpdate(query);
		}
		catch (Exception e) {
			throw e;
		}
	}

	/**
	 * closeSqlNonRS
	 * Should be used when done with the SQL service, 
	 * but WANT the last resultset provided.
	 * @throws SQLException
	 */
	public void closeSqlNonRS() throws SQLException {
		this.statement.close();
		this.connect.close();
		this.connect					= null;
		this.statement					= null;
		this.resultSet					= null;
	}
	
	/**
	 * closeSql
	 * Should be used when done with the SQL service, 
	 * and does NOT wish to use the last resultset anymore.
	 * @throws SQLException
	 */
	public void closeSql() throws SQLException {
		this.resultSet.close();
		this.statement.close();
		this.connect.close();
		this.connect					= null;
		this.statement					= null;
		this.resultSet					= null;
	}
}
