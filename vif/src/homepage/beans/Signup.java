package homepage.beans;

import homepage.database.DBAccess;

public class Signup {
	private String email;
	private String repeat_email;
	private String password;
	private String repeat_password;
	private String fname;
	private String lname;
	private String birthday;
	private String phone;
	private String address;
	private String zip;
	private String city;
	private String nation;
	private boolean public_email;
	
	
	public Signup() {
	}
	
	public boolean createUser() {
		// TODO
		// If validated -> create instance of db connection
		// Convert bena data to corresponding db type and send data to db connection and let it work
		// db connection should return true or false - return this to jsp-page.
		
		if(!validateData()){
			return false; 
		}
		else{
			try{
				DBAccess.getConnection("user");	
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		
		return false;
	}
	
	public boolean validateData() {
		// TODO
		// Validate current fields.
		// Return true if successfull, otherwise false. As long as validateData returns false createUser can't be run.
		if(!this.email.contentEquals("[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}")){ 
			return false;
		}
		if(!this.repeat_email.equals(this.email)){
			return false;
		}
		if(!this.password.contentEquals("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")){
			return false;
		}
		if(!this.repeat_password.equals(this.password)){
			return false;
		}
		if(!this.fname.contentEquals("[a-zA-ZÆØÅæøå ]") || this.fname.length() > 50 ){
			return false;
		}
		if(!this.lname.contentEquals("([a-zA-ZÆØÅæøå])")){
			return false;
		}
		if(!this.birthday.contentEquals("[0-9]{8}")){
			return false;
		} //TODO skal den birthday v�re p� den 6 eller den 8 cifre !?
		if(!this.phone.contentEquals("[0-9]{8,15}")){
			return false;
		}
		if(!this.address.contentEquals("[a-zA-ZÆØÅæøå0-9., ]")){
			return false;
		}
		if(!this.zip.contentEquals("[0-9]{4,10}") || this.zip.length() > 10){
			return false;
		}
		if(!this.city.contentEquals("[a-zA-ZÆØÅæøå. ]")){
			return false;
		}
//		if(!this.nation.contentEquals("[a-zA-ZÆØÅæøå ]") || this.nation.length() > 50){
//		 return false;
//		}
		return true;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRepeat_email() {
		return repeat_email;
	}
	public void setRepeat_email(String repeat_email) {
		this.repeat_email = repeat_email;
	}
	public String getPassword() {
		return password;
	}
	public String getRepeat_password() {
		return repeat_password;
	}
	public void setRepeat_password(String repeat_password) {
		this.repeat_password = repeat_password;
	}
	public void setPassword(String password) {
		this.password = password;
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
}