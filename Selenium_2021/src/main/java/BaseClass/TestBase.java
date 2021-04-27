package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.utility;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
	 prop=new Properties();
	FileInputStream file=new FileInputStream("/Users/manish/eclipse-workspace/Selenium_2021/src/main/resources/config/config.properties");
	prop.load(file);
		 
		
		
	}
	
	public void intialization()
	{
		
		String browesername=prop.getProperty("browser");
		if(browesername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utility.pageload_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utility.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	

}


