package homepage.beans;

public class AcceptUserBean {
	private String email;
	
	public AcceptUserBean() {
	}
	
	public boolean acceptUser(String email) {
		// TODO
		// If clicking accept -> create instance of db conn
		// Update user to active/accepted
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
