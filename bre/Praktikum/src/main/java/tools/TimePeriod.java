package tools;

import java.util.GregorianCalendar;

public class TimePeriod {

	private GregorianCalendar beginPosition;
	private GregorianCalendar endPosition;
	
	
	
	public TimePeriod() {
		super();
	}



	public TimePeriod(GregorianCalendar beginPosition, GregorianCalendar endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
	}



	public GregorianCalendar getBeginPosition() {
		return beginPosition;
	}



	public void setBeginPosition(GregorianCalendar beginPosition) {
		this.beginPosition = beginPosition;
	}



	public GregorianCalendar getEndPosition() {
		return endPosition;
	}



	public void setEndPosition(GregorianCalendar endPosition) {
		this.endPosition = endPosition;
	}
	
	
}
