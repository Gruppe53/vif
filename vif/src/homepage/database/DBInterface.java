package homepage.database;

public class DBInterface {
	DBAccess DBA = new DBAccess();

	/**
	 * createUser
	 * @param f_name - Firstnames and middelnames
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

		try{
			DBA.doSqlUpdate("");
			DBA.closeSql();
		}
		catch(Exception e){
			System.out.println(e);
		};


		return 1;
	}
}
