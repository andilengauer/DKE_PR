package tools;

public class Segment {

	private String designator;
	private double startPoint;
	private double endPoint;
	
	
	
	public Segment() {
		super();
	}



	public Segment(String designator, double startPoint, double endPoint) {
		super();
		this.designator = designator;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}



	public String getDesignator() {
		return designator;
	}



	public void setDesignator(String designator) {
		this.designator = designator;
	}



	public double getStartPoint() {
		return startPoint;
	}



	public void setStartPoint(double startPoint) {
		this.startPoint = startPoint;
	}



	public double getEndPoint() {
		return endPoint;
	}



	public void setEndPoint(double endPoint) {
		this.endPoint = endPoint;
	}
	
	
	
	
	
	
}
