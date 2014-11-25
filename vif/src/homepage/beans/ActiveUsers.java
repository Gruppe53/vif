package homepage.beans;

import java.io.*;

public class ActiveUsers extends Users {
	public ActiveUsers() {
	}
	
	@Override
	public void createUserList(Writer out) throws IOException {
		// TODO
		// Get data from DB
		// Links should be: 
		// <a href="edituser?email=getEmailFromDb">
		// <a href="?promoteuser=getEmailFromDb">
		// <a href="?deactivate=getEmailFromDb">
		// If list is empty, print "Ingen brugere i databasen."
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
		out.write("<td><a href=\"javascript:if(confirm('Er du sikker på at du vil degradere brugeren med email: #indsætEmail?'))location='?deactivateUser=test@mail.dk';\"><img src=\"image/down.png\" alt=\"Deaktiver bruger\" /></a> <a href=\"#\"><img src=\"image/edit.png\" alt=\"Rediger bruger\" /></a></td>");
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
		out.write("<td><a href=\"#\"><img src=\"image/down.png\" alt=\"Deaktiver bruger\" /></a> <a href=\"#\"><img src=\"image/edit.png\" alt=\"Rediger bruger\" /></a></td>");
		out.write("</tr>");
	}
}