package dataobjects;

import java.util.List;

public class Member {
	
	private String memberId;
	private String memberType;
	private List<ValidTime> validTimeList;
	private String scenarioType;
	private String eventLocation;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public List<ValidTime> getValidTimeList() {
		return validTimeList;
	}
	public void setValidTimeList(List<ValidTime> validTimeList) {
		this.validTimeList = validTimeList;
	}
	public String getScenarioType() {
		return scenarioType;
	}
	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	

}
