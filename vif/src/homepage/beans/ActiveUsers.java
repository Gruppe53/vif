package homepage.beans;

import homepage.database.*;
import homepage.types.User;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ActiveUsers extends Users {
	public ActiveUsers() {
	}
	
	@Override
	public void createUserList(Writer out) throws IOException {
		try {
			dba = DBAccess.getConnection("user");
			
			ArrayList<User> users = (ArrayList<User>) dba.getAll(); // Ignore warning.
			
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
			
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i).isActive() && users.get(i).getU_level() > 1) {
					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					
					String pub = "Nej";
					
					if(users.get(i).isPublic_email())
						pub = "Ja";
						
					out.write("<tr>");
					out.write("<td>"+ users.get(i).getEmail() +"</td>");
					out.write("<td>"+ users.get(i).getFname() + " " + users.get(i).getLname() +"</td>");
					out.write("<td>"+ users.get(i).getPhone() +"</td>");
					out.write("<td>"+ df.format(users.get(i).getBirth()) +"</td>");
					out.write("<td>"+ users.get(i).getAddress() +"</td>");
					out.write("<td>"+ users.get(i).getZip() +"</td>");
					out.write("<td>"+ users.get(i).getCity() +"</td>");
					out.write("<td>"+ users.get(i).getNation() +"</td>");
					out.write("<td>"+ pub +"</td>");
					out.write("<td><a href=\"javascript:if(confirm('Er du sikker på, at du vil gøre "+ users.get(i).getEmail() +" inaktiv?'))location='?deactivate="+ users.get(i).getEmail() +"';\"><img src=\"image/down.png\" alt=\"Degrader bruger\" /></a><a href=\"javascript:if(confirm('Er du sikker på, at du vil opgradere "+ users.get(i).getEmail() +" til administrator?'))location='?promoteuser="+ users.get(i).getEmail() +"';\"><img src=\"image/up.png\" alt=\"Opgrader bruger\" /></a> <a href=\"javascript:if(confirm('Er du sikker på, at du vil redigere "+ users.get(i).getEmail() +"?'))location='edituser.jsp?email="+ users.get(i).getEmail() +"';\"><img src=\"image/edit.png\" alt=\"Rediger bruger\" /></a></td>");
					out.write("</tr>");
				}
			}
		} catch(Exception e) {
			out.write("<tr><td>Fejl ved indlæsning af data.</td></tr>");
			e.printStackTrace();
		}
	}
}
