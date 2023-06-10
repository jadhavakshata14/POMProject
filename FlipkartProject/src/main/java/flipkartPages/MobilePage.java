package flipkartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilePage
{
WebDriver driver;
	
	public MobilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='SAMSUNG']")
	public WebElement SamsungCheckbox;
	
	@FindBy(xpath="//div[text()='APPLE']")
	public WebElement AppleCheckbox;
	
	@FindBy(xpath="//div[text()='realme']")
	public WebElement RealmeCheckbox;
	
	@FindBy(xpath="(//div[text()='SAMSUNG'])[1]")
	public WebElement SamsungButton;
	
	@FindBy(xpath="(//div[text()='APPLE'])[1]")
	public WebElement AppleButton;
	
	@FindBy(xpath="(//div[text()='realme')[1]")
	public WebElement RealmeButton;
	
	@FindBy(xpath="(//div[text()='✕'])[1]")
	public WebElement CancelApple;
	
	@FindBy(xpath="(//div[text()='✕'])[2]")
	public WebElement CancelRealme;
	
	@FindBy(xpath="(//div[text()='✕'])[3]")
	public WebElement CancelSamsung;
	
	public void clickOnCheckbox()
	{
		SamsungCheckbox.click();
		AppleCheckbox.click();
		RealmeCheckbox.click();
	}
	
	public void displayFilter()
	{
		Assert.assertTrue(SamsungButton.isDisplayed(), "Samsung button is not displayed");
		Assert.assertTrue(AppleButton.isDisplayed(), "Apple button is not displayed");
		Assert.assertTrue(RealmeButton.isDisplayed(), "Realme button is not displayed");
	}
	
	public void clearFilter()
	{
		CancelApple.click();
		CancelRealme.click();
		CancelSamsung.click();
	}	


}
