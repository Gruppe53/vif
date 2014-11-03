package homepage.database;

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
