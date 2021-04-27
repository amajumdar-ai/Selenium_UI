package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> thread=new ThreadLocal<>();
	
	public WebDriver init_driver (String browser)
	{
		System.out.println("browser name is" +browser);
		
		if(thread.equals("chrome"))
		{
			
		WebDriverManager.chromedriver().setup();
		thread.set(new ChromeDriver());
			
			
		}
		
		else if(thread.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			thread.set(new FirefoxDriver());
		}
		
		else
		{
			System.out.println("Please enter a valid browser value" +browser);
			
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		return thread.get(); 
	}

	
	}


