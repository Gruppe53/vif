package homepage.types;

import java.util.ArrayList;
import java.util.Date;

public class Participant extends User {
	private int f_id;
	private boolean prevpar;
	private boolean workcamp;
	private String comment;
	private String fk_email;
	private ArrayList<ParticipantBid> bidList = new ArrayList<ParticipantBid>();
	
	public Participant(String email, String fname, String lname, Date birth, String phone, String address, String zip, String city, String nation, boolean public_email, boolean active, int u_level, int f_id, boolean prevpar, boolean workcamp, String comment, String fk_email) {
		super(email, fname, fname, birth, phone, address, zip, city, nation, public_email, active, u_level);
		this.f_id = f_id;
		this.prevpar = prevpar;
		this.workcamp = workcamp;
		this.comment = comment;
		this.fk_email = fk_email;
	}
	
	public void addToBidList(ParticipantBid bid) {
		bidList.add(bid);
	}
	
	public ArrayList<ParticipantBid> getBidList() {
		return this.bidList;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public boolean isPrevpar() {
		return prevpar;
	}

	public void setPrevpar(boolean prevpar) {
		this.prevpar = prevpar;
	}

	public boolean isWorkcamp() {
		return workcamp;
	}

	public void setWorkcamp(boolean workcamp) {
		this.workcamp = workcamp;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFk_email() {
		return fk_email;
	}

	public void setFk_email(String fk_email) {
		this.fk_email = fk_email;
	}
}