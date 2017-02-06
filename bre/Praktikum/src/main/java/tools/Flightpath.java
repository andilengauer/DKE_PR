package tools;

import java.util.List;

public class Flightpath {

	private String routeName;
	private String depatureAerodrome;
	private String destinationAerodrome;
	private String alternateAerodrome;
	private List<Segment> segments;
	
	
	
	public Flightpath() {
		super();
	}



	public Flightpath(String routeName, String depatureAerodrome, String destinationAerodrome,
			String alternateAerodrome, List<Segment> segments) {
		super();
		this.routeName = routeName;
		this.depatureAerodrome = depatureAerodrome;
		this.destinationAerodrome = destinationAerodrome;
		this.alternateAerodrome = alternateAerodrome;
		this.segments = segments;
	}



	public String getRouteName() {
		return routeName;
	}



	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}



	public String getDepatureAerodrome() {
		return depatureAerodrome;
	}



	public void setDepatureAerodrome(String depatureAerodrome) {
		this.depatureAerodrome = depatureAerodrome;
	}



	public String getDestinationAerodrome() {
		return destinationAerodrome;
	}



	public void setDestinationAerodrome(String destinationAerodrome) {
		this.destinationAerodrome = destinationAerodrome;
	}



	public String getAlternateAerodrome() {
		if(alternateAerodrome != null)
			return alternateAerodrome;
		return "";
	}



	public void setAlternateAerodrome(String alternateAerodrome) {
		this.alternateAerodrome = alternateAerodrome;
	}



	public List<Segment> getSegments() {
		return segments;
	}



	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	
	
	
}
