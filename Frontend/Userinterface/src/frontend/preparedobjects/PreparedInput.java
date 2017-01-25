package frontend.preparedobjects;

import java.util.Date;
import java.util.List;

public class PreparedInput {
	private Aircraft aircraft;
	private Date begindate;
	private Date enddate;
	private String routename;
	private String departure;
	private String destination;
	
	private List<PreparedSegment> segments;

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public Date getBegindate() {
		return begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getRoutename() {
		return routename;
	}

	public void setRoutename(String routename) {
		this.routename = routename;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<PreparedSegment> getSegments() {
		return segments;
	}

	public void setSegments(List<PreparedSegment> segments) {
		this.segments = segments;
	}
	
	
}
