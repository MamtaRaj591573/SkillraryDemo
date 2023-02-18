package genericLibraries;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * This class contains all resusable methods to perform opertaions on properties file
 * @author HP
 *
 */
public class PropertiesFileUtility 
{
	private Properties property;
	
	public void propertyFileInitialization(String filepath)
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(filepath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		property=new Properties();
		try
		{
			property.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String fetchProperty(String key)
	{
		return property.getProperty(key);
	}
}
