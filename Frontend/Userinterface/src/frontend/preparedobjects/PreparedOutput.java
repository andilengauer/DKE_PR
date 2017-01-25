package frontend.preparedobjects;

import java.util.ArrayList;
import java.util.List;

public class PreparedOutput {
	private PreparedInput input;
	private List<PreparedResult> results;
	public PreparedInput getInput() {
		return input;
	}
	public void setInput(PreparedInput input) {
		this.input = input;
	}
	public List<PreparedResult> getResults() {
		return results;
	}
	public void setResults(List<PreparedResult> results) {
		this.results = results;
	}
	
	public List<PreparedMessage> getNotams()
	{
		List<PreparedMessage> messages = new ArrayList<PreparedMessage>();
		
		for(PreparedResult r: results)
		{
			messages.add(r.getMessage());
		}
		return messages;
	}
	
}
