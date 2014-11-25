package homepage.beans;

import java.io.IOException;
import java.io.Writer;

public class Participants extends Users {
	private String year;
	
	public Participants() {
		getActiveYear();
	}

	private void getActiveYear() {
		// TODO
		// Create instance of db conn
		// If there's an active year, return this and apply to this.year (cast from type YEAR to String...)
		// TEST:
		this.year = "2015";
	}

	@Override
	public void createUserList(Writer out) throws IOException {
		// TODO
			// Get data from DB
			// Links should be: 
			// <a href="removebid?fid=getFormIdFromDb">
			// If list is empty, print "Ingen bud i databasen."
			out.write("<tr>");
			out.write("<td>Email</td>");
			out.write("<td>Navn</td>");
			out.write("<td>1. ønske</td>");
			out.write("<td>2. ønske</td>");
			out.write("<td>3. ønske</td>");
			out.write("<td>+ ønsker</td>");
			out.write("<td>Ønsker ikke</td>");
			out.write("<td></td>");
			out.write("</tr>");
			out.write("<tr>");
			out.write("<td>maagenator@gmail.com</td>");
			out.write("<td>Kristin Hansen</td>");
			out.write("<td>1: 00.00-04.00</td>");
			out.write("<td>1: 12.00-16.00</td>");
			out.write("<td>2: 16.00-20.00</td>");
			out.write("<td>Ingen</td>");
			out.write("<td>1: 20.00-00.00</td>");
			out.write("<td><a href=\"javascript:if(confirm('Er du sikker på at du vil fjerne bud til vagtplan med email: #indsætEmail?'))location='?removebid=test@mail.dk';\"><img src=\"image/delete.png\" alt=\"Fjern bud til vagtplan\" /></a></td>");
			out.write("</tr>");
			out.write("<tr>");
			out.write("<td>larspeter94@gmail.com</td>");
			out.write("<td>Lars Peter Jensen</td>");
			out.write("<td>1: 00.00-04.00</td>");
			out.write("<td>3: 12.00-16.00</td>");
			out.write("<td>5: 12.00-16.00</td>");
			out.write("<td>Ingen</td>");
			out.write("<td>2: 00.00-04.00</td>");
			out.write("<td><a href=\"javascript:if(confirm('Er du sikker på at du vil fjerne bud til vagtplan med email: #indsætEmail?'))location='?removebid=test@mail.dk';\"><img src=\"image/delete.png\" alt=\"Fjern bud til vagtplan\" /></a></td>");
			out.write("</tr>");
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
