package db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestDriver {

	public static void main(String[] args) {
		DB_Controller controller = new DB_Controller();
		String hLine = "\n-------------------------------------------------------------------\n";
		controller.initDB();
		
		
		//get data of file
		String result = controller.getData("db/Test", "mondial.xml");
		System.out.println(result + hLine);
		
		//put file to database collection
		//controller.putFile("db/DKE_PR/FilterInput", "src/db/test.xml");
		//System.out.println(hLine);
		
		
		//execute XQuery and get result as string
		result = controller.executeXQuery("doc(\"/db/DKE_PR/sample_dnotams.xml\")//*:AIXMBasicMessage");
		System.out.println(result + hLine);
		File d = new File("dnotams.xml");
		System.out.println(d.getAbsolutePath());
		try {
			FileWriter writer = new FileWriter(d);
			writer.write(result);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
