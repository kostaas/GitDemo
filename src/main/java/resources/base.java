package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initilizeDriver() throws IOException//throws IOExceptions
	{
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		
		String browserName=System.getProperty("browser");
		
		if (browserName.contains("chrome"))
		{
			System.getProperty("webdriver.chrome.driver","use.dir");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless"))
			{
				options.addArguments("headless");
			}
				driver =new ChromeDriver(options);
		}		
		else if(browserName.contains("firefox"))
		{
			System.getProperty("webdriver.gecko.driver","user.dir");
			FirefoxOptions optionsf= new FirefoxOptions();
			if (browserName.contains("headless"))
			{
				optionsf.addArguments("headless");
			}
				driver =new FirefoxDriver(optionsf);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
