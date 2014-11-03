package homepage.database;

/**
 * DBInfo
 * @author anders
 * The storage of database login information, 
 * this is being used by DBAccess to determine which server to log into.
 * 
 * Change the int "whichserver" to change which of the listed servers you wish to log into.
 * whichserver:
 * 1 - Localhost
 * 2 - not defined
 * 3 - not defined 
 */
public class DBInfo {
	private String DBHost;
	private int DBPort;
	private String DBDatabase;
	private String DBUserName;
	private String DBPassword;
	final int whichserver = 1; //1 = localhost. There is no other databases at this time.

	public DBInfo() {
		if (this.whichserver == 1){
			this.DBHost = "localhost";
			this.DBPort = 3306;
			this.DBDatabase = "DB_name";
			this.DBUserName = "root";
			this.DBPassword = "";
		}
		if (this.whichserver == 2){
			this.DBHost = "DB_Host";
			this.DBPort = 0000;
			this.DBDatabase = "DB_name";
			this.DBUserName = "DB_UserName";
			this.DBPassword = "DB_Password";
		}
		if (this.whichserver == 3){
			this.DBHost = "DB_Host";
			this.DBPort = 0000;
			this.DBDatabase = "DB_name";
			this.DBUserName = "DB_userName";
			this.DBPassword = "DB_Password";
		}
		

	}

	public String getDBHost() {
		return DBHost;
	}

	public int getDBPort() {
		return DBPort;
	}

	public String getDBDatabase() {
		return DBDatabase;
	}

	public String getDBUserName() {
		return DBUserName;
	}

	public String getDBPassword() {
		return DBPassword;
	}
}
