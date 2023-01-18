package basetest;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestUtiels 


{
	//this is used to generate report    
	//property add krna padta h log4j.properties

	public static Logger log()
	{
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
	public static String getPropertiesData(String key)
	//this method use to read data property mtlb udher jo data enter krre h wo yahan se bhejege
	//property add krna padta h dada.properties
	
	{
		String value = null;
		try
		{
			String path = "./src/main/resources/data.properties";
			FileInputStream file = new FileInputStream( path );
			Properties prop = new Properties();
			prop.load(file);
			value = prop.get(key).toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return value;
	}
	
	
	
}
