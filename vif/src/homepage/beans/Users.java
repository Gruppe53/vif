package homepage.beans;

import java.io.*;

public abstract class Users {
	public abstract void createUserList(Writer out) throws IOException;
	
	public boolean deactivateUser(String email) {
		System.out.println(email);
		// TODO
		// If clicking deactivate -> create instance of db conn
		// Deactivate user
		// Return true if succeeding with sql delete, false otherwise
		return false;
	}
	
	public boolean reactivateUser(String email) {
		System.out.println(email);
		// TODO
		// If clicking reactive -> create instance of db conn
		// Reactive user
		// Return true if succeeding with sql update, false otherwise
		return false;
	}
	
	public boolean acceptUser(String email) {
		System.out.println(email);
		// TODO
		// If clicking accept -> create instance of db conn
		// Update user to active/accepted
		// Return true if succeeding with sql update, false otherwise
		return false;
	}
	
	public boolean deleteUser(String email) {
		System.out.println(email);
		// TODO
		// If clicking delete -> create instance of db conn
		// Delete user
		// Return true if succeeding with sql delete, false otherwise
		return false;
	}
	
	public boolean promoteUser(String email) {
		System.out.println(email);
		// TODO
		// If clicking promote -> create instance of db conn
		// Promote user
		// Return true if succeeding with sql update, false otherwise
		return false;
	}
	
	public boolean removeBid(String email) {
		System.out.println(email);
		// TODO
		// If clicking remove bid -> create instance of db conn
		// Remove bid AND related wishes
		// Return true if succeeding with sql delete, false otherwise (turn off autocommit and run
		// both sql deletes. If one fails, both fails!)
		
		return false;
	}
}
