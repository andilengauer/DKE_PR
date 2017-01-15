package tools;

public class Aircraft {

	private String aircraftDesignator;
	private String aircraftType;
	private double wingSpan;
	private double maxWeight;
	private double minWeight;
	
	
	
	public Aircraft() {
		super();
	}



	public Aircraft(String aircraftDesignator, String aircraftType, double wingSpan, double maxWeight,
			double minWeight) {
		super();
		this.aircraftDesignator = aircraftDesignator;
		this.aircraftType = aircraftType;
		this.wingSpan = wingSpan;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}



	public String getAircraftDesignator() {
		return aircraftDesignator;
	}



	public void setAircraftDesignator(String aircraftDesignator) {
		this.aircraftDesignator = aircraftDesignator;
	}



	public String getAircraftType() {
		return aircraftType;
	}



	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}



	public double getWingSpan() {
		return wingSpan;
	}



	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}



	public double getMaxWeight() {
		return maxWeight;
	}



	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}



	public double getMinWeight() {
		return minWeight;
	}



	public void setMinWeight(double minWeight) {
		this.minWeight = minWeight;
	}
	
	
	
	
}
