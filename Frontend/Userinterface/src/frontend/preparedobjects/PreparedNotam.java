package frontend.preparedobjects;

import java.util.Date;

public class PreparedNotam {
	String id;
	String text;
	String begin, end;
	String importance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
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
