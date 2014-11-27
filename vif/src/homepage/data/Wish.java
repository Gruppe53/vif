package homepage.data;

import java.util.Date;

public class Wish {
	private int p_id;
	private int festival_day;
	private Date start_time;
	private Date end_time;
	
	public Wish(int p_id, int festival_day, Date start_time, Date end_time) {
		this.p_id = p_id;
		this.festival_day = festival_day;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getFestival_day() {
		return festival_day;
	}

	public void setFestival_day(int festival_day) {
		this.festival_day = festival_day;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
}
