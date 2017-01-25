package frontend.preparedobjects;

import java.util.List;

public class PreparedMessage {
	String id;
	List<PreparedNotam> notams;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<PreparedNotam> getNotams() {
		return notams;
	}
	public void setNotams(List<PreparedNotam> notams) {
		this.notams = notams;
	}
	
	
}
