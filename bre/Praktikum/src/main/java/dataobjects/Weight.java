package dataobjects;

public class Weight {
	private String interpretation;
	private double value;
	public String getInterpretation() {
		if(interpretation == null)
			return "";
		return interpretation;
	}
	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
