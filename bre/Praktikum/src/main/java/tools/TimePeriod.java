package tools;

import java.util.Date;
import java.util.GregorianCalendar;

public class TimePeriod {

	private Date beginPosition;
	private Date endPosition;
	
	
	
	public TimePeriod() {
		super();
	}



	public TimePeriod(Date beginPosition, Date endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
	}



	public Date getBeginPosition() {
		return beginPosition;
	}



	public void setBeginPosition(Date beginPosition) {
		this.beginPosition = beginPosition;
	}



	public Date getEndPosition() {
		return endPosition;
	}



	public void setEndPosition(Date endPosition) {
		this.endPosition = endPosition;
	}
	
	
}
