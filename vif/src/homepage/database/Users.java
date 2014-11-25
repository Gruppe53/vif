package homepage.database;

import java.sql.*;

public class Users {
String email;
String f_name;
String l_name;
String birth;
String phone;
String address;
String zip;
String city;
String nation;
Boolean public_email;
String password;
Boolean active;
int fk_u_level_id;

	public Users(String email, String f_name, String l_name, String birth, String phone, String address, String zip, String city, String nation, int public_email, String password,int active, int fk_u_level_id){
		this.email = email;
		this.f_name = f_name;
		this.l_name = l_name;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.nation = nation;
		
		if (public_email == 1){ this.public_email = true;}
		else this.public_email = false;

		this.password = password;
		
		if(active == 1){ this.active = true;}
		else this.active = false;
	
		this.fk_u_level_id = fk_u_level_id;
	}

	public String getEmail() {
		return email;
	}


	public String getF_name() {
		return f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public String getBirth() {
		return birth;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}


	public String getZip() {
		return zip;
	}


	public String getCity() {
		return city;
	}


	public String getNation() {
		return nation;
	}


	public Boolean getPublic_email() {
		return public_email;
	}


	public String getPassword() {
		return password;
	}


	public Boolean getActive() {
		return active;
	}


	public int getFk_u_level_id() {
		return fk_u_level_id;
	}
	
	@Override
public String toString() {
	return "Users [email=" + email + ", f_name=" + f_name + ", l_name="
			+ l_name + ", birth=" + birth + ", phone=" + phone + ", address="
			+ address + ", zip=" + zip + ", city=" + city + ", nation="
			+ nation + ", public_email=" + public_email + ", password="
			+ password + ", active=" + active + ", fk_u_level_id="
			+ fk_u_level_id + "]";
}
}
