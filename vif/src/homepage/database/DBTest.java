package homepage.database;
import java.sql.*;

public class DBTest {

	
	public static void main(String[] args) {
		System.out.println("hej");
		try{
			DBInterface DBI = new DBInterface();
			
			Users user = DBI.getUser("anders@vif.dk");
			
			System.out.println(user + "");
		} catch(Exception e) {
			System.out.println("Error has occured: " + e);
		}
	}
}
