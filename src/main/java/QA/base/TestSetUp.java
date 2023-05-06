package QA.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetUp {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public  TestSetUp()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("/Users/shaheenhaider/eclipse-workspace/MidTrans/src/main/java/QA/config/Config.properties");
			prop.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void Initialization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Firefox"))
		
		{
			System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/eclipse-workspace/MidTrans/drivers/geckodriver");
			driver=new FirefoxDriver();
			
			
			
		}
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}  
