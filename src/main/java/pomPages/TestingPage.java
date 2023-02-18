package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class TestingPage
{
	//Declaration
	@FindBy(xpath="")
	private WebElement pageHeader;
	@FindBy(xpath="")
	private WebElement seleniumImage;
	@FindBy(xpath="")
	private WebElement cartArea;
	@FindBy(xpath="")
	private WebElement facebookPage;
	
	//initialization
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public void getSeleniumImage()
	{
		
	}
	public void getCartArea()
	{
		
	}
	
	public void scrollTillFacebook(WebDriverUtility web)
	{
		web.scrollToElement(facebookPage);
	}
	public void clickFacebookIcon()
	{
		facebookPage.click();
	}

}
