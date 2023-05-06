package Qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import QA.base.TestSetUp;
import QA.pages.CheckOutPage;
import QA.pages.Homepage;

public class HomepageTest extends TestSetUp {
	public static Homepage hm;
	public static CheckOutPage cp;
	
	public HomepageTest()
	{
		
		super();
	}
	@BeforeMethod
	public static void SetUp() throws Exception
	{
		Initialization();
		hm=new Homepage();
		cp=new CheckOutPage();
		
	}
	@Test(priority=1)
	public void LogoDisplayOfsites()
	{
		String str=hm.VerifyTitle();
		if(str.contains("Midtrans Pillow"))
		{
			
			System.out.println("mid");
		}
	
	}
	
	@Test(priority=2)
	public void VerifyPriceTag()
	{
		
		hm.PriceOfPillow();
	}
	@Test(priority=3)
	
	public void PrecautionText()
	{
		
		boolean f= hm.PreText();
		if(f==true)
		{
			
			System.out.println("Humm");
		}
	}
	
	
	@Test(priority=4)
	public void ClickOperate()
	{
		
		   
	}
	

	
	
	@AfterMethod
	public void TearDown()
	{
		
		driver.quit();
	}

}
