package homepage.beans;

import java.util.*;

public class ParticipantsBean {
	private List<String[]> partList = new ArrayList<String[]>();
	private String[] partInfo = new String[9];
	
	public ParticipantsBean() {
	}

	public List<String[]> getPartList() {
		return partList;
	}

	public void setPartList(List<String[]> partList) {
		this.partList = partList;
	}

	public String[] getPartInfo() {
		return partInfo;
	}

	public void setPartInfo(String[] partInfo) {
		this.partInfo = partInfo;
	}
}
