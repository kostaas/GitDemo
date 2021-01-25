package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By username=By.cssSelector("input[id='UserName']");
	By password=By.cssSelector("[id='Password']");
	By signin=By.cssSelector("input[type='submit']");
	By forgotPassword=By.xpath("//a[contains(text(),'Ξεχάσατε τον κωδικό σας;')]"); //hyperlink ξεχάσατε τον κωδικό σας
	By signOn=By.xpath("//a[contains(text(),'Εγγραφείτε')]"); //hyperlink εγγραφείτε
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}
	
	//public WebElement forgotPassword
	
	//public WebElement singOn
	
}
