package frontend.preparedobjects;

public class PreparedResult {
	private PreparedMessage message;
	private String eventscenario, location, importance;
	
	public PreparedMessage getMessage() {
		return message;
	}

	public void setMessage(PreparedMessage message) {
		this.message = message;
	}

	public String getEventscenario() {
		return eventscenario;
	}

	public void setEventscenario(String eventscenario) {
		this.eventscenario = eventscenario;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImportance() {
		if(importance != null)
			return importance;
		return "";
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}
	
}
