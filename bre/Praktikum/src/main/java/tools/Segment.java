package tools;

import java.awt.Point;
import java.awt.geom.Point2D;

public class Segment {

	private String designator;
	private Coordinate startPoint;
	private Coordinate endPoint;
	
	
	
	public Segment() {
		super();
	}



	public Segment(String designator, Coordinate startPoint, Coordinate endPoint) {
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



	public Coordinate getStartPoint() {
		return startPoint;
	}



	public void setStartPoint(Coordinate startPoint) {
		this.startPoint = startPoint;
	}



	public Coordinate getEndPoint() {
		return endPoint;
	}



	public void setEndPoint(Coordinate endPoint) {
		this.endPoint = endPoint;
	}
	
	
	
	
	
	
}
