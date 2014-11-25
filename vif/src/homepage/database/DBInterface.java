package homepage.database;

import java.sql.*;

public class DBInterface extends DBAccess{
	DBAccess DBA;
	private ResultSet resultSet = null;

//	public static void main(String [ ] args){
//		try { 
//			DBAccess DBA = DBAccess.getConnection();
//		} catch(Exception e){
//			System.out.println("Error has occured: " + e);
//		}
//	}
	
public Users getUser(String email){
		resultSet = null;
		Users user = null;
		try{
			DBA = DBAccess.getConnection();
			resultSet = DBA.doSqlQuery("SELECT DISTINCT * FROM users WHERE email='" + email +"'");
			
			while (resultSet.next()){
				user = new Users(resultSet.getString("email"), resultSet.getString("f_name"), resultSet.getString("l_name"), resultSet.getString("birth"), resultSet.getString("phone"), resultSet.getString("address"), resultSet.getString("zip"), resultSet.getString("city"), resultSet.getString("nation"), resultSet.getInt("public_email"), resultSet.getString("password"), resultSet.getInt("active"), resultSet.getInt("fk_u_level_id"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return user;
	}
	
	
	/**
	 * createUser
	 * @param f_name - Firstname and middelnames
	 * @param l_name - Lastnames
	 * @param email - Email address
	 * @param birth - birthdate format: "yyyy-mm-dd"
	 * @param phone - mobilenumber
	 * @param address - address with street and number
	 * @param zip - zipcode
	 * @param city - city of recidents
	 * @param nation - nationality of origin
	 * @param public_mail - want mail address to be public
	 * @param password - password for later login
	 * @return 1 - if succes, 0 - if not succes
	 */
	public int createUser(String f_name, String l_name, String email, String birth, int phone, String address, int zip, String city, String nation, boolean public_mail, String password){		
		int i = 0;
		
		try{
			i = DBA.doSqlUpdate("INSERT INTO users VALUES ('" + f_name + "', '" + l_name + "', '" + email + "', '" + birth + "', " + phone + ", '" + address + "', " + zip + ", '" + city + "', '" + nation + "', " + public_mail + ", '" + password + "')");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}
	
	public int createWishes(int fk_f_id, String fk_tp_id){		
		int i = 0;
		try{
			i = DBA.doSqlUpdate("INSERT INTO wishes VALUES (" + fk_f_id + ", '" + fk_tp_id + "')");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}

	public int createUserlevel(String email, int fk_ul_id){		
		int i = 0;
		try{
			i = DBA.doSqlUpdate("INSERT INTO user_level VALUES ('" + email + "', " + fk_ul_id + ")");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}
	
	public int createTimeperiods(String tp_id, String startT, String endT){		
		int i = 0;
		
		try{
			i = DBA.doSqlUpdate("INSERT INTO timeperiods VALUES ('" + tp_id + "', '" + startT + "', '" + endT + "')");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}
	
	public int createLevels(int ul_id, int level, String description){		
		int i = 0;
		
		try{
			i = DBA.doSqlUpdate("INSERT INTO levels VALUES (" + ul_id + ", " + level + ", '" + description + "')");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}
	
	public int createForm(int f_id, String fk_email, boolean prePar, boolean workCamp, String comment){		
		int i = 0;
		int prePar_int = 0;
		int workCamp_int = 0;
		
		if(prePar == true){
			prePar_int = 1;
		}
		
		if(workCamp == true){
			workCamp_int = 1;
		}
		
		try{
			i = DBA.doSqlUpdate("INSERT INTO form VALUES (" + f_id + ", '" + fk_email + "', " + prePar_int + ", '" + workCamp_int + "', '" + comment + "')");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return i;
	}
	
//	public ResultSet getUser(String email){
//		
//		try{
//			resultSet = DBA.doSqlQuery("SELECT DISTINCT * FROM users WHERE email='" + email +"'");
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		
//		
//		return resultSet;
//	}
	
	public ResultSet getForm(String email, int year){
		try{
			resultSet = DBA.doSqlQuery("SELECT DISTINCT * FROM users WHERE ");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		return resultSet;
	}
	
	//Få fat i årstallet
	//SELECT DISTINCT YEAR(startT) FROM users NATURAL JOIN form NATURAL JOIN wishes NATURAL JOIN timeperiods WHERE YEAR(startT) IN (SELECT MAX(YEAR(StartT)) FROM timeperiods)
	
}
