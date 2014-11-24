package homepage.beans;

import java.util.*;

public class UsersBean {
	private List<String[]> userList = new ArrayList<String[]>();
	private String[] userInfo = new String[10];
	
	public UsersBean() {
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
