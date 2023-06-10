package flipkartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement CancelButton;
	
	@FindBy(xpath="//div[text()='Mobiles']")
	public WebElement MobileTab;
	
	public void closingPopup()
	{
		CancelButton.click();
	}
	public void mobileFunction()
	{
		MobileTab.click();
	}


}
