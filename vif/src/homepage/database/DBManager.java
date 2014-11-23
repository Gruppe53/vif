package homepage.database;

public class DBManager {
	private String dbUrl;
	private String dbUser;
	private String dbPass;

	public void setDbUrl(String initParameter) {
		this.dbUrl = initParameter;
	}

	public void setDbUser(String initParameter) {
		this.dbUser = initParameter;
	}

	public void setDbPass(String initParameter) {
		this.dbPass = initParameter;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public String getDbUser() {
		return dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}
}
