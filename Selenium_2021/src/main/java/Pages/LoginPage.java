package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginPage extends TestBase {
	
	// Object repositories or page factory
	
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu' and @type='submit']")
	WebElement btn;
	
	@FindBy(xpath="//a[@class='_1_3w1N']")
	WebElement loginbtn;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement username;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginButton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement crossbtn;
	
			
			

	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	public void loginbtn()
	{
		
		btn.click();
		
		
		
	}
	public void login(String un, String pwd)
	{
		username.sendKeys(un);	
		password.sendKeys(pwd);
		loginButton.click();
		
	}
	
	
	public void searchElement(String text)
	{
		crossbtn.click();
		search.sendKeys(text);
		btn.click();
		
	}
	
	


	



}
