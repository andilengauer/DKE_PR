package tools;

import java.util.List;

public class Flightpath {

	private String routeName;
	private String depatureAerodrome;
	private String destinationAerodrome;
	private String alternateAerodrome;
	private List<Segments> segments;
	
	
	
	public Flightpath() {
		super();
	}



	public Flightpath(String routeName, String depatureAerodrome, String destinationAerodrome,
			String alternateAerodrome, List<Segments> segments) {
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
		return alternateAerodrome;
	}



	public void setAlternateAerodrome(String alternateAerodrome) {
		this.alternateAerodrome = alternateAerodrome;
	}



	public List<Segments> getSegments() {
		return segments;
	}



	public void setSegments(List<Segments> segments) {
		this.segments = segments;
	}
	
	
	
}
