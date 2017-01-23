package dataobjects;

import java.util.List;

public class AixmMessage {

		private String messageId;
		private List<Member> members;
		
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
		
		
}
