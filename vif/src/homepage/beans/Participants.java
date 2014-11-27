package homepage.beans;

import homepage.data.Participant;
import homepage.data.ParticipantBid;
import homepage.database.*;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Participants extends Users {
	private String year;
	private DBAccess dba = null;
	
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
		try {
			dba = DBAccess.getConnection("parti");
			ArrayList<Participant> participants = (ArrayList<Participant>) dba.getAll();
			
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
			
			for(int i = 0; i < participants.size(); i++) {
				ArrayList<ParticipantBid> bidList = participants.get(i).getBidList();
				
				out.write("<td>"+ participants.get(i).getEmail() +"</td>");
				out.write("<td>"+ participants.get(i).getFname() +" " + participants.get(i).getLname() +"</td>");
				
				for(ParticipantBid p : bidList) {
					if(p.getWeight() == 1)
						out.write("<td>"+ p.getFestival_day() +": "+ p.getStart_time() +"-"+ p.getEnd_time() +"</td>");
					if(p.getWeight() == 2)
						out.write("<td>"+ p.getFestival_day() +": "+ p.getStart_time() +"-"+ p.getEnd_time() +"</td>");
					if(p.getWeight() == 3)
						out.write("<td>"+ p.getFestival_day() +": "+ p.getStart_time() +"-"+ p.getEnd_time() +"</td><td>Ingen</td>");
					if(p.getWeight() == 5)
						out.write("<td>"+ p.getFestival_day() +": "+ p.getStart_time() +"-"+ p.getEnd_time() +"</td>");
				}
				
				out.write("<td><a href=\"javascript:if(confirm('Er du sikker på at du vil fjerne bud til vagtplan med email: "+ participants.get(i).getEmail() +"?'))location='?removebid="+ participants.get(i).getF_id() +"';\"><img src=\"image/delete.png\" alt=\"Fjern bud til vagtplan\" /></a></td>");
				out.write("</tr>");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
