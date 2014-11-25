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
			resultSet = statement.executeQuery(query); //TODO DBAccess: tror der er fejl her ?

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
//		this.connect					= null;
//		this.statement					= null;
//		this.resultSet					= null;
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
//		this.connect					= null;
//		this.statement					= null;
//		this.resultSet					= null;
	}
}
