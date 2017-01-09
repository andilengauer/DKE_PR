package frontend;

import java.util.Map;

public class AppController {
	private static AppController controller = null;
	private static Map<String,String> map ;
	private String currentId = null;
	
	public static AppController getInstance()
	{
		if(controller == null)
			controller = new AppController();
		
		return controller;
	}
	
	public void setCurrentId(String Id)
	{
		currentId = Id;
	}
	public String getCurrentId()
	{
		return currentId;
	}
	
}
