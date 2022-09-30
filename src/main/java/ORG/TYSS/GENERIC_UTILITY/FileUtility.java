package ORG.TYSS.GENERIC_UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
	FileInputStream fis;
	 Properties properties;
	/**
	 * This method is used for initialize the property file
	 * @param filePath
	 */

		public void initializePropertyFile(String filePath)
		{
			try {
				fis=new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			properties=	new Properties();
			
			try {
				properties.load(fis);
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
		/**
		 * This method is used to fetch the data from property file
		 * @param key
		 * @return
		 */
public String getDataFromProperty(String key) {
	return properties.getProperty(key).trim();
}

}
