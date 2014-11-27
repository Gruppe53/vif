package homepage.beans;

public class Login {
	private String username = "";
	private String password = "";
	private int level = 999999999;
	private boolean isLogged = false;
	
	public Login() {
	}
	
	public void tryLogin() {
		if(this.isLogged)
			return;
		
		if(username != null && password != null) {
		    if(username.length() > 0 && password.length() > 0) {
		    	try {
		    		// TODO
		    		// Get users from db - use username and password as WHERE clauses
		    		// If the returned resultset has any values -> set session logged to true
		    		
		    		this.isLogged = true;	// For now...
		    		this.level = 1;			// For now...
		    	} catch (Exception e) {
		    		e.printStackTrace();
		    	}
		    }
		}
	}
	
	public void tryLogout() {
		try {
			this.isLogged = false;
			this.username = "";
			this.password = "";
			this.level = 999999999;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}