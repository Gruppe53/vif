package homepage.types;

import java.sql.Time;

public class ParticipantBid {
	private int weight;
	private int festival_day;
	private Time start_time;
	private Time end_time;
	
	public ParticipantBid(int weight, int festival_day, Time start_time, Time end_time) {
		this.weight = weight;
		this.festival_day = festival_day;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFestival_day() {
		return festival_day;
	}

	public void setFestival_day(int festival_day) {
		this.festival_day = festival_day;
	}

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
}
