package homepage.beans;

import java.util.ArrayList;
import java.util.List;

public class ArchiveUserBean {
	private List<String[]> userList = new ArrayList<String[]>();
	private String[] userInfo = new String[9];
	
	public ArchiveUserBean() {
	}
	
	public List<String[]> getUserList() {
		return userList;
	}
	public void setUserList(List<String[]> userList) {
		this.userList = userList;
	}
	public String[] getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String[] userInfo) {
		this.userInfo = userInfo;
	}
}
