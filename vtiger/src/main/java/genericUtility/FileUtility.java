package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Akash Deb
 *
 */
public class FileUtility {
	
	/**
	 * This method fetches data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_October2023_Project\\vtiger\\src\\main\\resources\\commonData.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		return prop.getProperty(key);
	}

}
