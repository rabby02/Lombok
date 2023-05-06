package QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QA.base.TestSetUp;

public class CheckOutPage extends TestSetUp {
	
	/*@FindBy(xpath="//*[@id=\"container\"]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	WebElement ShopCartElementName;*/
	
	@FindBy(xpath="//*[text()='Midtrans Pillow']")
	WebElement sc;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]/input")
	WebElement SendAmount;
	@FindBy(xpath="//a[contains(@class,'btn buy')]")
	WebElement ClickBuyNow;
	@FindBy(xpath="//input[@value='Budi']")
	WebElement verifyname;
	@FindBy(xpath="//*[text()='20,000']")
	WebElement total;
	@FindBy(xpath="//input[@value='budi@utomo.com']")
	WebElement MailVerify;
	@FindBy(xpath="//input[@value='081808466410']")
	WebElement ContactVerify;
	@FindBy(xpath="//input[@value='Jakarta']")
	WebElement CountryVerification;
	@FindBy(xpath="//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
	WebElement Addresverify;
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public void ClIck()
	{
		ClickBuyNow.click();
		
	}

	public boolean GetTextOfName()
	{
		
		return sc.isDisplayed();
	}
	public void SendAmount()
	{
		
		SendAmount.sendKeys("20000");
	}
	public String NameVerify()
	{
		return verifyname.getText();
		
	}
	public String verifyTotal()
	{
		return total.getText();
		
	}
	
	public String VerifyMail()
	{
		
		return MailVerify.getText();
	}
	public String VerifyContact()
	{
		return ContactVerify.getText();
		
	}
	public boolean VerifyCountry()
	{
		return CountryVerification.isDisplayed();
	}
	public void AddressverificaTion(String str)
	{
		
		Addresverify.clear();
		Addresverify.sendKeys(str);
	}
	
	

}
