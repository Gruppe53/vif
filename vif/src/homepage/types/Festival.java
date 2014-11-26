package homepage.types;

public class Festival extends VifType {
	private int year;
	private boolean active;
	
	public Festival() {
		super();
		// TODO
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
