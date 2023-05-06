package Qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import QA.base.TestSetUp;
import QA.pages.CheckOutPage;
import QA.pages.Homepage;

public class CheckOutPageTest extends TestSetUp {
	public static CheckOutPage cp;
	public static Homepage hm;
	
	public CheckOutPageTest()
	{
		
		super();
	}
	@BeforeMethod
	public static void SetUp() throws Exception
	{
		
		
		Initialization();
		cp=new CheckOutPage();
		//hm=new Homepage();
		
		
		
	}
	/*@Test(priority=1)
	public void LandOnCheckOut()
	{
		
		cp=hm.ClickOnOperation();
	}*/
	@Test(priority=1)
	public void CartElementText()
	{
		cp.ClIck();
		boolean flag=cp.GetTextOfName();
		if(flag==true)
		{
			System.out.println("Yes");
		}
	}
	@Test(priority=2)
	public void SendSomeKey()
	{
		cp.ClIck();
		cp.SendAmount();
	}
	
	@Test(priority=3)
	public void Naming()
	{
		cp.ClIck();
		String str=cp.NameVerify();
		System.out.println(str);
	}
	@Test(priority=4)
	public void ToalVerify()
	{
		cp.ClIck();
		//System.out.println(cp.verifyTotal())
		if(cp.verifyTotal().contains("20,000"))
		{
			
			Assert.assertTrue(true);
		}
		
	}
	@Test(priority=5)
	public void VerifyGmail()
	{
		cp.ClIck();
		String str=cp.VerifyMail();
		if(str.equals("budi@utomo.com"))
		{
			Assert.assertTrue(true,"Its true");
		}
		
	}
	@Test(priority=6)
	public void ContactVerification()
	{
		cp.ClIck();
		String exp=cp.VerifyContact();
		if(exp.contains("081808466410"))
		{
			Assert.assertTrue(true);
		}
	}
	@Test(priority=7)
	public void VerifyCountryLoc()
	{
		cp.ClIck();
		boolean flag=cp.VerifyCountry();
		if(flag==true)
		{
			System.out.println("Jakarta");
		}
	}
	@Test(priority=8)
	public void AddVer()
	{
		cp.ClIck();
		cp.AddressverificaTion("1801 120th Street college point Ny");
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		
		driver.quit();
	}

}
