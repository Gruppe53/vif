package homepage.beans;

import javax.servlet.ServletContext;

public class Login {
	private String username;
	private String password;
	private boolean check = false;
	private boolean isLogged = false;
	
	public Login() {
	}
	
	public synchronized static void init(ServletContext application) {
		// TODO
	}
	
	public boolean isLogged() {
		// TODO
		// Check if already logged
		if(check)
			return false;
		
		return isLogged;
	}
	
	public void tryLogin() {
		if (!check)
			return;
		
		this.isLogged = false;
	    this.check = false;
	    
	    if(username.length() > 0 && password.length() > 0) {
	    	try {
	    		// TODO
	    		// Get users from db - use username and password as WHERE clauses
	    		// If the returned resultset has any values -> set session logged to true
	    		
	    		this.isLogged = true; // korrekt! Brugeren er logget ind.
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	}
	
	public void tryLogout() {
		try {
			this.isLogged = false;
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

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
}