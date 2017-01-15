package db;

public class TestDriver {

	public static void main(String[] args) {
		DB_Controller controller = new DB_Controller();
		String hLine = "\n-------------------------------------------------------------------\n";
		controller.initDB();
		
		/*
		//get data of file
		String result = controller.getData("db/Test", "mondial.xml");
		System.out.println(result + hLine);
		*/
		//put file to database collection
		controller.putFile("db/DKE_PR/FilterInput", "src/db/test.xml");
		System.out.println(hLine);
		
		/*
		//execute XQuery and get result as string
		result = controller.executeXQuery("doc(\"/db/miete.xml\")//person[@nr=\"p1\"]");
		System.out.println(result + hLine);
		*/
		
	}

}
