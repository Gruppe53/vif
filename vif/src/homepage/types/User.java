package homepage.types;

import java.util.Date;

public class User extends VifType {
	private String email;
	private String fname;
	private String lname;
	private Date birth;
	private String phone;
	private String address;
	private String zip;
	private String city;
	private String nation;
	private boolean public_email;
	private boolean active;
	private int u_level;
	
	public User(String email, String fname, String lname, Date birth, String phone, String address, String zip, String city, String nation, boolean public_email, boolean active, int u_level) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.nation = nation;
		this.public_email = public_email;
		this.active = active;
		this.u_level = u_level;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
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

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public boolean isPublic_email() {
		return public_email;
	}

	public void setPublic_email(boolean public_email) {
		this.public_email = public_email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getU_level() {
		return u_level;
	}

	public void setU_level(int u_level) {
		this.u_level = u_level;
	}
}
