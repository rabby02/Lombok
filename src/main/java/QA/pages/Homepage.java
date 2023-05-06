package QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QA.base.TestSetUp;

public class Homepage extends TestSetUp {
	
	@FindBy(xpath="//div[contains(@class,'title']")
	WebElement SiteLogo;
	@FindBy(xpath="//span[contains(text(),'20,000')]")
	WebElement priceTag;
	@FindBy(xpath="//i[contains(text(),'Disclaimer: This is not a real transaction.No funds will be transfered out of your account. You should sleep with a proper pillow to refrain yourself from injury.')]")
	WebElement precaution;
	@FindBy(xpath="//*[@id=\"carousel\"]/div[1]/div[1]/div")
	WebElement DisplayFronpage;
	@FindBy(xpath="//span[contains(text(),'Get cozy with our new pillow!')]")
	WebElement Text;
	@FindBy(xpath="//a[contains(@class,'btn buy')]")
	WebElement ClickBuyNow;
	
	
	
	public Homepage()
	{
		
		PageFactory.initElements(driver, this);
	}
	public String VerifyTitle()
	{
		
		 return driver.getTitle();
		
	}
	public void PriceOfPillow()
	{
		
		
		priceTag.isDisplayed();
		
		
	}
	
	public boolean PreText()
	{
		
		return precaution.isDisplayed();
	}
	
	
	public CheckOutPage ClickOnOperation()
	{
		ClickBuyNow.click();
		return new CheckOutPage();
		
	}
	

	
	
	
	
	
	
	

}

