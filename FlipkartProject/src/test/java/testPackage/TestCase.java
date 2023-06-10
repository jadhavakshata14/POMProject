package testPackage;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseConfigure;
import flipkartPages.HomePage;
import flipkartPages.MobilePage;

public class TestCase extends BaseConfigure
{
	HomePage hp;
	MobilePage mp;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException
	{
		driver = setup(Port);
		hp = new HomePage(driver);
		mp = new MobilePage(driver);
	}
	
	@Test
	public void testCase1() throws InterruptedException{
		hp.closingPopup();
		hp.mobileFunction();
		mp.clickOnCheckbox();
		mp.displayFilter();
		mp.clearFilter();
	}

}
