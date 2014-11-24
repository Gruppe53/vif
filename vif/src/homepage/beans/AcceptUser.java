package homepage.beans;

import java.io.*;

public class AcceptUser {	
	public AcceptUser() {
	}
	
	public boolean acceptUser(String email) {
		// TODO
		// If clicking accept (y) -> create instance of db conn
		// Update user to active/accepted
		return false;
	}
	
	public boolean deleteUser(String email) {
		// TODO
		// If clicking delete (n) -> create instance of db conn
		// Delete user
		return false;
	}
	
	public void createUserList(Writer out) throws IOException {
		// TODO
		// Get data from DB
		// Links should be: 
		// <a href="?acceptuser=getEmailFromDb">
		// <a href="?deleteuser=getEmailFromDb">
		out.write("<tr>");
		out.write("<td>Email</td>");
		out.write("<td>Navn</td>");
		out.write("<td>Telefon</td>");
		out.write("<td>Fødselsdato</td>");
		out.write("<td>Adresse</td>");
		out.write("<td>Zip</td>");
		out.write("<td>By</td>");
		out.write("<td>Land</td>");
		out.write("<td>Off. mail</td>");
		out.write("<td></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td>maagenator@gmail.com</td>");
		out.write("<td>Kristin Hansen</td>");
		out.write("<td>60228950</td>");
		out.write("<td>1987-12-05</td>");
		out.write("<td>Buddinge Hovedgade 124, 2.tv.</td>");
		out.write("<td>2860</td>");
		out.write("<td>Søborg</td>");
		out.write("<td>Danmark</td>");
		out.write("<td>Nej</td>");
		out.write("<td><a href=\"#\">y</a> | <a href=\"#\">n</a></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td>larspeter94@gmail.com</td>");
		out.write("<td>Lars Peter Jensen</td>");
		out.write("<td>65412387</td>");
		out.write("<td>1994-08-31</td>");
		out.write("<td>Buddinge Hovedgade 124, 2.tv.</td>");
		out.write("<td>2860</td>");
		out.write("<td>Søborg</td>");
		out.write("<td>Danmark</td>");
		out.write("<td>Nej</td>");
		out.write("<td><a href=\"#\">y</a> | <a href=\"#\">n</a></td>");
		out.write("</tr>");
	}
}
