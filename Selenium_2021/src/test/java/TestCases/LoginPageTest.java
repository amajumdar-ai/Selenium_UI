package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	public static LoginPage login;

	public LoginPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod()
	public void setUp() throws IOException
	{
		intialization();
	 login=new LoginPage();
	}
	
	@Test()
	public void loginTest()
	{
		login.login("9113396216", "aa2345678");
	}
	
	@Test()
	public void searchbtntest()
	{
		login.searchElement("cycle");
		
		
	}
@AfterMethod()
public void tearDown()
{
	driver.quit();
}
}
