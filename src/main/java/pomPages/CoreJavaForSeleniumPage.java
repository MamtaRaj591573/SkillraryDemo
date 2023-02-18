package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage 
{
	//declaration
	@FindBy(xpath="")
	private WebElement pageHeader;
	@FindBy(xpath="//h2[text()='core java for selenium']")
	private WebElement coreJavaForSeleniumLink;
	
	//initialization
	public CoreJavaForSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHEader()
	{
		return pageHeader.getText();
	}
	public void clickCoreJavaForSelenium()
	{
		coreJavaForSeleniumLink.click();
	}
	
}
