package homepage.beans;

import java.io.IOException;
import java.io.Writer;

public class Archive {
	private String year;
	
	public Archive() {
	}
	
	public boolean createArchivedList(Writer out) throws IOException {
		// TODO
		return false;
	}
	
	public boolean createArchive(Writer out) throws IOException {
		// TODO
		return false;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
