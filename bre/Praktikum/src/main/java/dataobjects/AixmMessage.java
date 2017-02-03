package dataobjects;

import java.util.Date;
import java.util.List;

public class AixmMessage {

		private String messageId;
		private List<Member> members;
		
		private Date begintime;
		private Date endtime;
		private String location;
		private String scenario;
		private boolean relevant = true;
		
		private String opStatus;
		private String usageType;
		private Wingspan wingspan;
		private Weight weight;
		private String flightMilitary;
		private String importance;
		
		public String getMessageId() {
			return messageId;
		}
		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}
		public List<Member> getMembers() {
			return members;
		}
		public void setMembers(List<Member> members) {
			this.members = members;
		}
		public Date getBegintime() {
			return begintime;
		}
		public void setBegintime(Date begintime) {
			this.begintime = begintime;
		}
		public Date getEndtime() {
			return endtime;
		}
		public void setEndtime(Date endtime) {
			this.endtime = endtime;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getScenario() {
			return scenario;
		}
		public void setScenario(String scenario) {
			this.scenario = scenario;
		}
		public boolean isRelevant() {
			return relevant;
		}
		public void setRelevant(boolean relevant) {
			this.relevant = relevant;
		}
		public String getOpStatus() {
			return opStatus;
		}
		public void setOpStatus(String opStatus) {
			this.opStatus = opStatus;
		}
		public String getUsageType() {
			return usageType;
		}
		public void setUsageType(String usageType) {
			this.usageType = usageType;
		}
		public Wingspan getWingspan() {
			return wingspan;
		}
		public void setWingspan(Wingspan wingspan) {
			this.wingspan = wingspan;
		}
		public Weight getWeight() {
			return weight;
		}
		public void setWeight(Weight weight) {
			this.weight = weight;
		}
		public String getFlightMilitary() {
			return flightMilitary;
		}
		public void setFlightMilitary(String flightMilitary) {
			this.flightMilitary = flightMilitary;
		}
		public String getImportance() {
			return importance;
		}
		public void setImportance(String importance) {
			this.importance = importance;
		}
		
		
		
		
}
