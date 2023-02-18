package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage 
{
	//Declaration
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTraining;	
	@FindBy(xpath="//a[text()='CATEGORY']")
	private WebElement Category;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement clickContactUs;
	//initialzation
	
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getPageHEader()
	{
		return pageHeader;
	}
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining()
	{
		seleniumTraining.click();
	}
	public void selectCategory(WebDriverUtility web,int text)
	{
		web.dropdown(Category,text);
	}
	public WebElement getContactUs()
	{
		return clickContactUs;
	}
	
	public void clickContactUs()
	{
		clickContactUs.click();
	}
	
	


}
