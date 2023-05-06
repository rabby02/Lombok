package QA.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
	
	 static WebDriver driver;
	
	@BeforeClass
	public static void TearUp()
	{
		driver=lauchingBrowser("Firefox");
		
	}
	
	@Test
	public void Testing()
	{
		
		System.out.println("Hello tester!");
	}
	
	public static WebDriver lauchingBrowser(String bnamw)
	{
		WebDriver driver1 = null;
		if(bnamw.equalsIgnoreCase("Firefox"))
		{
			

			System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/eclipse-workspace/MidTrans/geckodriver");
			driver1=new FirefoxDriver();
		}
		driver1.manage().window().maximize();
		//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().deleteAllCookies();
		return driver1;
		
	}
	@AfterClass
	public void tearDown() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
