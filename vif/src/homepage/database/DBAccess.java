package homepage.database;

import homepage.data.VifType;

import java.sql.SQLException;
import java.util.*;

public abstract class DBAccess {
	private static DBAccess dbinstance;
	
	abstract public List<?> getAll() throws SQLException;
	abstract public VifType getSpecific(String clause) throws SQLException;
	abstract public boolean updateSpecific(ArrayList<String> data) throws Exception;
	abstract public boolean deleteSpecific(String clause) throws Exception;
	
	synchronized public static DBAccess getConnection(String type) throws Exception {
		switch(type) {
			case "parti":
				dbinstance = new DBParticipantAcccess();
				break;
			case "archive":
				dbinstance = new DBArchiveAccess();
				break;
			case "user":
				dbinstance = new DBUserAccess();
				break;
		}
		
		return dbinstance;
	}
}
