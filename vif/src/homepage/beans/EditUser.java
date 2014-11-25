package homepage.beans;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class EditUser {
	private String email;
	private String password;
	private String repeat_password;
	private String fname;
	private String lname;
	private String birthday;
	private String phone;
	private String address;
	private String zip;
	private String city;
	
	public EditUser() {
	}
	
	public boolean getUserData(String email) throws SQLException {
		this.email = (email);
		// TODO
		// Create instance of db conn
		// Get data from db where email=email
		// Return true if data was returned from db, otherwise false
		
		if(this.email.equals("test@test.dk")) {
			this.fname = "Kristin";
			this.lname = "Hansen";
			this.city = "Søborg";
			this.birthday = "1987-12-05";
			this.phone = "60228950";
			this.zip = "2860";
			this.address = "Buddinge Hovedgade 124, 2.tv.";
		}
		return false;
	}
	
	public boolean validateData(HttpServletRequest req) {
		// TODO
		// Validate data.
		// If validated return true, false otherwise.
		return false;
	}

	public boolean editUser(HttpServletRequest req) {
		// TODO
		// if(validateData(req)) -> create instance of db conn
		// Update user
		// Return true if sql update succeeded, false otherwise
		return false;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeat_password() {
		return repeat_password;
	}

	public void setRepeat_password(String repeat_password) {
		this.repeat_password = repeat_password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
