package homepage.database;

/**
 * DBInfo
 * @author anders
 * The storage of database login information, 
 * this is being used by DBAccess to determine which server to log into.
 */
public class DBInfo {
	public static final String DB_HOST = "localhost";
	public static final int DB_PORT = 3306;
	public static final String DB_DATABASE = "vif";
	public static final String DB_USERNAME = "root";
	public static final String DB_PASSWORD = "";
}
