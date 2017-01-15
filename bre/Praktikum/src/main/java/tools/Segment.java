package tools;

import java.awt.Point;
import java.awt.geom.Point2D;

public class Segment {

	private String designator;
	private Point2D startPoint;
	private Point2D endPoint;
	
	
	
	public Segment() {
		super();
	}



	public Segment(String designator, Point2D startPoint, Point2D endPoint) {
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



	public Point2D getStartPoint() {
		return startPoint;
	}



	public void setStartPoint(Point2D startPoint) {
		this.startPoint = startPoint;
	}



	public Point2D getEndPoint() {
		return endPoint;
	}



	public void setEndPoint(Point2D endPoint) {
		this.endPoint = endPoint;
	}
	
	
	
	
	
	
}
