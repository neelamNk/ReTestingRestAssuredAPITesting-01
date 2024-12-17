package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnviroment {

	public static Map<String, String> FileAndEnv = new HashMap<String, String>();

	public static Properties propMain = new Properties();
	public static Properties proppreSet = new Properties();

	public static Map<String, String> AndFileEnv() throws IOException{
			
		
		String Enviroment = System.getProperty("env");
		try {
		if(Enviroment.equalsIgnoreCase("Devloper")) {
		
				FileInputStream fileDev;
			
					fileDev = new FileInputStream(System.getProperty("user.dir")+"./Input/Devloper.properties");
				
				propMain.load(fileDev);
				FileAndEnv.put("serverulr", propMain.getProperty("serverulr"));
				FileAndEnv.put("portNo", propMain.getProperty("portNo"));
				FileAndEnv.put("username", propMain.getProperty("username"));
				FileAndEnv.put("password", propMain.getProperty("password"));
				
			} 
			else if(Enviroment.equalsIgnoreCase("QA")) {
				FileInputStream fileQA = new FileInputStream(System.getProperty("user.dir")+"./Input/QA.properties");
				propMain.load(fileQA);
				FileAndEnv.put("serverulr", propMain.getProperty("serverulr"));
				FileAndEnv.put("portNo", propMain.getProperty("portNo"));
				FileAndEnv.put("username", propMain.getProperty("username"));
				FileAndEnv.put("password", propMain.getProperty("password"));
			}else if(Enviroment.equalsIgnoreCase("Staging")) {
				FileInputStream FileStagingEnv = new FileInputStream(System.getProperty("user.dir")+"./Input/QA.properties");
				propMain.load(FileStagingEnv);
				FileAndEnv.put("serverulr", propMain.getProperty("serverulr"));
				FileAndEnv.put("portNo", propMain.getProperty("portNo"));
				FileAndEnv.put("username", propMain.getProperty("username"));
				FileAndEnv.put("password", propMain.getProperty("password"));
			
			
		} }
			catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
           
	return FileAndEnv;
		
		
		}

	public static Map<String, String> configReaderFiles() throws IOException {
		
		if(FileAndEnv ==null) {
			FileAndEnv =AndFileEnv();
			
		}
		return FileAndEnv;

	}
}
