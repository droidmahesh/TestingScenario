package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class logincredential {
	
	
	public static String fplogin(String path , String key) throws IOException {
		
		FileInputStream fp = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		prop.load(fp);
		
		String value = prop.getProperty(key);
		
		return value;
		 
		
		
		
	}

}
